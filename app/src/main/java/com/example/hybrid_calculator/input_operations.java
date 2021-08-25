package com.example.hybrid_calculator;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class input_operations extends Fragment {

    private Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttonclear,buttonback,buttonpercent,buttondivide,buttonmultiply,buttonplus,buttonminus,buttondecimal,buttonequals;
    private SharedViewModel viewModel;

    public input_operations() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_input_operations, container, false);
        button0 = v.findViewById(R.id.button0);
        button1 = v.findViewById(R.id.button1);
        button2 = v.findViewById(R.id.button2);
        button3 = v.findViewById(R.id.button3);
        button4 = v.findViewById(R.id.button4);
        button5 = v.findViewById(R.id.button5);
        button6 = v.findViewById(R.id.button6);
        button7 = v.findViewById(R.id.button7);
        button8 = v.findViewById(R.id.button8);
        button9 = v.findViewById(R.id.button9);
        buttonplus = v.findViewById(R.id.plus);
        buttonminus = v.findViewById(R.id.minus);
        buttonmultiply = v.findViewById(R.id.multiply);
        buttonpercent = v.findViewById(R.id.percent);
        buttondivide = v.findViewById(R.id.divide);
        buttonback = v.findViewById(R.id.backspace);
        buttonclear = v.findViewById(R.id.clear);
        buttonequals = v.findViewById(R.id.equal);
        buttondecimal = v.findViewById(R.id.decimal);

        viewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);

        buttonclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.setText("");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.setText("0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.setText("1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.setText("2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.setText("3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.setText("4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.setText("5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.setText("6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.setText("7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.setText("8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.setText("9");
            }
        });

        buttondecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.setText(".");
            }
        });

        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.setText("back");
            }
        });

        buttonplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.setOptext("+");
            }
        });

        buttonminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.setOptext("-");
            }
        });

        buttondivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.setOptext("/");
            }
        });

        buttonmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.setOptext("X");
            }
        });

        buttonpercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.setOptext("%");
            }
        });

        buttonequals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.setEqualcon(1);
            }
        });






        return v;
    }
}