package com.example.trycalclator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.trycalclator.impl.Calc_impl;

public class MainActivity extends AppCompatActivity {
    public TextView textView;
    public Button p, mi, mu, d, e;
    private Calc_impl calcImpl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        calcImpl = new Calc_impl();

        // initialize Textview
        textView = findViewById(R.id.t);
        // initialize every buttons
        p = findViewById(R.id.plass);
        mi = findViewById(R.id.minus);
        mu = findViewById(R.id.multy);
        d = findViewById(R.id.div);
        e = findViewById(R.id.equal);

        // Updated display at startup
        //updateDisplay();


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}