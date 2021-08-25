package com.example.hybrid_calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.mozilla.javascript.Interpreter;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

import static com.example.hybrid_calculator.R.id.backspace;
import static com.example.hybrid_calculator.R.id.fragcontain;

public class MainActivity extends AppCompatActivity {
    private TextView inputext,resulttext;
    private static final int CONTENT_VIEW_ID = 10101010;
    private Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttonpercent,buttondivide,buttonmultiply,buttonsubtract,buttonadd,buttonequals,buttonclear,buttonback,buttondecimal;
    private String stdtext;
    private double first;
    private double second;
    private double result;
    private String operation;
    private String Answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().replace(fragcontain,new input_operations());
        inputext = findViewById(R.id.textView3);
        resulttext= findViewById(R.id.textView4);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonadd = findViewById(R.id.plus);
        buttonsubtract = findViewById(R.id.minus);
        buttonmultiply = findViewById(R.id.multiply);
        buttonpercent = findViewById(R.id.percent);
        buttondivide = findViewById(R.id.divide);
        buttonback = findViewById(R.id.backspace);
        buttonclear = findViewById(R.id.clear);
        buttonequals = findViewById(R.id.equal);
        buttondecimal = findViewById(R.id.decimal);
        getSupportActionBar().hide();

        buttonclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputext.setText(stdtext);
                resulttext.setText("");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resulttext.getText() != "Infinity") {
                    String string = resulttext.getText().toString() + button0.getText().toString();
                    resulttext.setText(string);
                }
                else {
                    String string = button0.getText().toString();
                    resulttext.setText(string);
                }
            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resulttext.getText() != "Infinity") {
                    String string = resulttext.getText().toString() + button1.getText().toString();
                    resulttext.setText(string);
                }
                else {
                    String string = button1.getText().toString();
                    resulttext.setText(string);
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resulttext.getText() != "Infinity") {
                    String string = resulttext.getText().toString() + button2.getText().toString();
                    resulttext.setText(string);
                }
                else {
                    String string = button2.getText().toString();
                    resulttext.setText(string);
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resulttext.getText() != "Infinity") {
                    String string = resulttext.getText().toString() + button3.getText().toString();
                    resulttext.setText(string);
                }
                else {
                    String string = button3.getText().toString();
                    resulttext.setText(string);
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resulttext.getText() != "Infinity") {
                    String string = resulttext.getText().toString() + button4.getText().toString();
                    resulttext.setText(string);
                }
                else {
                    String string = button4.getText().toString();
                    resulttext.setText(string);
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resulttext.getText() != "Infinity") {
                    String string = resulttext.getText().toString() + button5.getText().toString();
                    resulttext.setText(string);
                }
                else {
                    String string = button5.getText().toString();
                    resulttext.setText(string);
                }
            }
        });


        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resulttext.getText() != "Infinity") {
                    String string = resulttext.getText().toString() + button6.getText().toString();
                    resulttext.setText(string);
                }
                else {
                    String string = button6.getText().toString();
                    resulttext.setText(string);
                }
            }
        });


        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resulttext.getText() != "Infinity") {
                    String string = resulttext.getText().toString() + button7.getText().toString();
                    resulttext.setText(string);
                }
                else {
                    String string = button7.getText().toString();
                    resulttext.setText(string);
                }
            }
        });


        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resulttext.getText() != "Infinity") {
                    String string = resulttext.getText().toString() + button8.getText().toString();
                    resulttext.setText(string);
                }
                else {
                    String string = button8.getText().toString();
                    resulttext.setText(string);
                }
            }
        });


        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resulttext.getText() != "Infinity") {
                    String string = resulttext.getText().toString() + button9.getText().toString();
                    resulttext.setText(string);
                }
                else {
                    String string = button9.getText().toString();
                    resulttext.setText(string);
                }
            }
        });


        buttondecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = resulttext.getText().toString() + buttondecimal.getText().toString();
                resulttext.setText(string);
            }
        });

        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String space = null;

                if (resulttext.getText().length() > 0) {
                    StringBuilder stringBuilder = new StringBuilder(resulttext.getText());
                    stringBuilder.deleteCharAt(resulttext.getText().length() - 1);
                    space = stringBuilder.toString();
                    resulttext.setText(space);

                }
            }
        });


         buttonpercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resulttext.getText().length() > 0) {
                    String Primary;
                    first = Double.parseDouble((String) resulttext.getText());
                    Primary = String.format("%.2f", first);
                    inputext.setText(Primary + " %");
                    resulttext.setText("");
                    operation = "%";
                }
            }
        });
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*if (inputext.getText().toString() != stdtext) {
                    String string = inputext.getText().toString();
                    String endchar = string.substring(inputext.getText().length());
                    StringBuilder stringBuilder = new StringBuilder(inputext.getText());
                    if ((endchar != "+") || (endchar != "-") || (endchar != "*") || (endchar != "/")) {
                        stringBuilder.append("+");
                    }
                    else {
                        stringBuilder.deleteCharAt(string.length() - 1);
                        stringBuilder.append("+");
                    }
                    inputext.setText(stringBuilder.toString());
                }
                else {
                    inputext.setText("0+");
                }

                 */
                if (resulttext.getText().length() > 0) {
                    String Primary;
                    first = Double.parseDouble((String) resulttext.getText());
                    Primary = String.format("%.2f", first);
                    inputext.setText(Primary + " +");
                    resulttext.setText("");
                    operation = "+";
                }
                else {
                    resulttext.setText("+");
                }

            }
        });

        buttonsubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*if (inputext.getText().toString() != stdtext) {
                    String string = inputext.getText().toString();
                    String endchar = string.substring(inputext.getText().length() - 1);
                    StringBuilder stringBuilder = new StringBuilder(inputext.getText());
                    if ((endchar != "+") || (endchar != "-") || (endchar != "*") || (endchar != "/")) {
                        stringBuilder.append("-");
                    }
                    else {
                        stringBuilder.deleteCharAt(string.length() - 1);
                        stringBuilder.append("-");
                    }
                    inputext.setText(stringBuilder.toString());
                }
                else {
                    inputext.setText("0-");
                }

                 */
                if (resulttext.getText().length() > 0) {
                    String Primary;
                    first = Double.parseDouble((String) resulttext.getText());
                    Primary = String.format("%.2f", first);
                    inputext.setText(Primary + " -");
                    resulttext.setText("");
                    operation = "-";
                }
                else {
                    resulttext.setText("-");

                }
            }
        });

        buttonmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*if (inputext.getText().toString() != stdtext) {
                    String string = inputext.getText().toString();
                    String endchar = string.substring(inputext.getText().length() - 1);
                    StringBuilder stringBuilder = new StringBuilder(inputext.getText());
                    if ((endchar != "+") || (endchar != "-") || (endchar != "*") || (endchar != "/")) {
                        stringBuilder.append("*");
                    }
                    else {
                        stringBuilder.deleteCharAt(string.length() - 1);
                        stringBuilder.append("*");
                    }
                    inputext.setText(stringBuilder.toString());
                }
                else {
                    inputext.setText("0*");
                }

                 */
                if (resulttext.getText().length() > 0) {
                    String Primary;
                    first = Double.parseDouble((String) resulttext.getText());
                    Primary = String.format("%.2f", first);
                    inputext.setText(Primary + " X");
                    resulttext.setText("");
                    operation = "*";
                }

            }
        });

        buttondivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*if (inputext.getText().toString() != stdtext) {
                    String string = inputext.getText().toString();
                    String endchar = string.substring(inputext.getText().length() - 1);
                    StringBuilder stringBuilder = new StringBuilder(inputext.getText());
                    if ((endchar != "+") || (endchar != "-") || (endchar != "*") || (endchar != "/")) {
                        stringBuilder.append("/");
                    }
                    else {
                        stringBuilder.deleteCharAt(string.length() - 1);
                        stringBuilder.append("/");
                    }
                    inputext.setText(stringBuilder.toString());
                }
                else {
                    inputext.setText("0/");
                }

                 */
                if (resulttext.getText().length() > 0) {
                    String Primary;
                    first = Double.parseDouble((String) resulttext.getText());
                    Primary = String.format("%.2f", first);
                    inputext.setText(Primary + " /");
                    resulttext.setText("");
                    operation = "/";
                }
            }
        });

        buttonequals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              if (inputext.getText().length() > 0) {
                  second = Double.parseDouble((String) resulttext.getText());
                  if (operation == "+") {
                      result = first + second;
                      String answer = String.format("%.2f", result);
                      resulttext.setText(answer);
                      inputext.setText(null);
                  }
                  if (operation == "-") {
                      result = first - second;
                      String answer = String.format("%.2f", result);
                      resulttext.setText(answer);
                      inputext.setText(null);
                  }
                  if (operation == "*") {
                      result = first * second;
                      String answer = String.format("%.2f", result);
                      resulttext.setText(answer);
                      inputext.setText(null);
                  }
                  if (operation == "/") {
                      if (second != 0) {
                          result = first / second;
                          String answer = String.format("%.2f", result);
                          resulttext.setText(answer);
                          inputext.setText(null);
                      }
                      else {
                          ToastMessage();
                          inputext.setText(null);
                          resulttext.setText(null);
                      }
                  }
                  if (operation == "%") {
                      result = (first / 100) * second;
                      String answer = String.format("%.2f", result);
                      resulttext.setText(answer);
                      inputext.setText(null);
                  }

              }

            }
        });
    };
    private void ToastMessage() {
        Toast.makeText(MainActivity.this, "Division By Zero Is Not Valid", Toast.LENGTH_SHORT).show();
    }






    }

