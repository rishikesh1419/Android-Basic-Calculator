package com.example.android_basic_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void calc(View view) {
        EditText e1 = findViewById(R.id.textfno);
        EditText e2 = findViewById(R.id.textsno);
        int value1 = Integer.parseInt(e1.getText().toString());
        int value2 = Integer.parseInt(e2.getText().toString());
        int result = 0;

        if(view.getId()==R.id.btnAdd)
            result = value1 + value2 ;
        if(view.getId()==R.id.btnSub)
            result = value1 - value2 ;
        if(view.getId()==R.id.btnMul)
            result = value1 * value2 ;
        if(view.getId()==R.id.btnDiv)
            result = value1 / value2 ;
        TextView res = (TextView)findViewById(R.id.textresult);
        res.setText(String.valueOf(result));
    }
}
