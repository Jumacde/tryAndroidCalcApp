package com.example.trycalclator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.trycalclator.impl.Calc_impl;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button p, mi, mu, d, e;

    private Calc calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.t);

        p = findViewById(R.id.plass);
        mi = findViewById(R.id.minus);
        mu = findViewById(R.id.multy);
        d = findViewById(R.id.div);
        e = findViewById(R.id.equal);

        calculator = new Calc_impl();

        updateDisplay();

        p.setOnClickListener(v -> handleOperatorClick((Button)v, "+"));
        mi.setOnClickListener(v -> handleOperatorClick((Button)v, "-"));
        mu.setOnClickListener(v -> handleOperatorClick((Button)v, "x"));
        d.setOnClickListener(v -> handleOperatorClick((Button)v, "÷"));
        e.setOnClickListener(v -> handleOperatorClick((Button)v, "="));
    }

    public void press1(View view) { calculator.appendDigit(1); updateDisplay(); }
    public void press2(View view) { calculator.appendDigit(2); updateDisplay(); }
    public void press3(View view) { calculator.appendDigit(3); updateDisplay(); }
    public void press4(View view) { calculator.appendDigit(4); updateDisplay(); }
    public void press5(View view) { calculator.appendDigit(5); updateDisplay(); }
    public void press6(View view) { calculator.appendDigit(6); updateDisplay(); }
    public void press7(View view) { calculator.appendDigit(7); updateDisplay(); }
    public void press8(View view) { calculator.appendDigit(8); updateDisplay(); }
    public void press9(View view) { calculator.appendDigit(9); updateDisplay(); }
    public void press0(View view) { calculator.appendDigit(0); updateDisplay(); }

    public void ac(View view) {
        calculator.clear();
        updateDisplay();
    }

    public void point(View view) {
        calculator.addDecimalPoint();
        updateDisplay();
    }

    private void handleOperatorClick(Button button, String operator) {
        calculator.applyOperator(operator);
        updateDisplay();
    }

    private void updateDisplay() {
        textView.setText(calculator.getCurrentDisplayString());
    }
}