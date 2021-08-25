package com.example.hybrid_calculator;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class output_fragment extends Fragment {
    private TextView storeoperation;
    private TextView showoperation;
    private SharedViewModel showmodel;
    public double first,second,result;
    public String operation;




    public output_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_output_fragment, container, false);
        storeoperation = v.findViewById(R.id.textView3);
        showoperation = v.findViewById(R.id.textView4);
        first = 0;
        second = 0;
        showmodel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);
        showmodel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                if (s == "back") {
                    String space = null;
                    if (showoperation.getText().length() > 0) {
                        StringBuilder stringBuilder = new StringBuilder(showoperation.getText());
                        stringBuilder.deleteCharAt(showoperation.getText().length() - 1);
                        space = stringBuilder.toString();
                        showoperation.setText(space);
                    }
                }
                else if (s == "") {
                    showoperation.setText(s);
                    storeoperation.setText(s);
                }
                else if (storeoperation.getText().toString() != "") {
                    showoperation.setText(showoperation.getText() + s);
                    second = Double.parseDouble(showoperation.getText() + s);
                }
                else {
                    showoperation.setText(showoperation.getText() + s);
                }
            }
        });

        showmodel.getOpText().observe(getViewLifecycleOwner(), new Observer<String>() {
                    @Override
                    public void onChanged(String s) {
                        if (s != "=") {
                            if (storeoperation.getText().toString() == "") {
                                if (showoperation.getText().toString() != "") {

                                    storeoperation.setText(showoperation.getText() + " " + s);
                                    showoperation.setText("");
                                    operation = s;
                                }
                            } else {
                                String recurop;
                                StringBuilder stringBuilder = new StringBuilder(storeoperation.getText());
                                recurop = stringBuilder.substring(0, stringBuilder.length() - 2).toString();
                                storeoperation.setText(recurop + " " + s);
                                operation = s;
                                showoperation.setText("");
                            }
                        }
                    }
                });
        showmodel.getequalcon().observe(getViewLifecycleOwner(), new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                if (integer == 1) {
                  if ((showoperation.getText().toString() != "") && (storeoperation.getText().toString() != "")) {
                      if (operation == "+") {
                          String Answer;
                          StringBuilder stringBuilder = new StringBuilder(storeoperation.getText());
                          Answer = stringBuilder.substring(0, stringBuilder.length() - 2).toString();
                          first = Double.parseDouble(Answer);
                          second = Double.parseDouble(showoperation.getText().toString());
                          result = first + second;
                          showoperation.setText(String.valueOf(result));
                          storeoperation.setText("");
                          first = 0;
                          second = 0;
                      }

                      if (operation == "-") {
                          String Answer;
                          StringBuilder stringBuilder = new StringBuilder(storeoperation.getText());
                          Answer = stringBuilder.substring(0, stringBuilder.length() - 2).toString();
                          first = Double.parseDouble(Answer);
                          second = Double.parseDouble(showoperation.getText().toString());
                          result = first - second;
                          showoperation.setText(String.valueOf(result));
                          storeoperation.setText("");
                          first = 0;
                          second = 0;
                      }
                      if (operation == "X") {
                          String Answer;
                          StringBuilder stringBuilder = new StringBuilder(storeoperation.getText());
                          Answer = stringBuilder.substring(0, stringBuilder.length() - 2).toString();
                          first = Double.parseDouble(Answer);
                          second = Double.parseDouble(showoperation.getText().toString());
                          result = first * second;
                          showoperation.setText(String.valueOf(result));
                          storeoperation.setText("");
                          first = 0;
                          second = 0;
                      }
                      if (operation == "/") {
                          if (second != 0) {
                              String Answer;
                              StringBuilder stringBuilder = new StringBuilder(storeoperation.getText());
                              Answer = stringBuilder.substring(0, stringBuilder.length() - 2).toString();
                              first = Double.parseDouble(Answer);
                              second = Double.parseDouble(showoperation.getText().toString());
                              result = first / second;
                              showoperation.setText(String.valueOf(result));
                              storeoperation.setText("");
                              first = 0;
                              second = 0;
                          } else {
                              Toast.makeText(getActivity(), "Division By Zero Is Not Valid", Toast.LENGTH_SHORT).show();
                              showoperation.setText("");
                              storeoperation.setText("");

                          }

                      }
                      if (operation == "%") {
                          String Answer;
                          StringBuilder stringBuilder = new StringBuilder(storeoperation.getText());
                          Answer = stringBuilder.substring(0, stringBuilder.length() - 2).toString();
                          first = Double.parseDouble(Answer);
                          second = Double.parseDouble(showoperation.getText().toString());
                          result = (first / 100) * second;
                          showoperation.setText(String.valueOf(result));
                          storeoperation.setText("");
                          first = 0;
                          second = 0;
                      }
                      showmodel.setEqualcon(0);
                  }
                }
            }
        });








        return v;
    }

    @Override
    public void onViewCreated( View view,Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }




}