package com.example.hybrid_calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

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

public class MainActivity extends AppCompatActivity {
    private TextView inputext, resulttext;
    private static final int CONTENT_VIEW_ID = 10101010;
    private Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonpercent, buttondivide, buttonmultiply, buttonsubtract, buttonadd, buttonequals, buttonclear, buttonback, buttondecimal;
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
        input_operations InputFragment = new input_operations();
        output_fragment OutputFragment = new output_fragment();
        getSupportActionBar().hide();

        FragmentManager manager = getSupportFragmentManager();

        manager.beginTransaction().replace(R.id.inputcontain,InputFragment).commit();
        manager.beginTransaction().replace(R.id.Outputcontain,OutputFragment).commit();
    }





}

