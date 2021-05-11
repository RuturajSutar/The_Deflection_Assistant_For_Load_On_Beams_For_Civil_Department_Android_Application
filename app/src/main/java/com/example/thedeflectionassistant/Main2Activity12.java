package com.example.thedeflectionassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity12 extends AppCompatActivity {

    double w,l,answer;
    public void calculation(View view){
        EditText editText=(EditText)findViewById(R.id.editText);
        EditText editText2=(EditText)findViewById(R.id.editText2);
        w=Double.parseDouble(editText.getText().toString());
        l=Double.parseDouble(editText2.getText().toString());
        answer=(5*w*l*l*l*l)/384;
        TextView textView3=(TextView)findViewById(R.id.textView3);
        TextView textView20=(TextView)findViewById(R.id.textView20);
        textView3.setText("Answer is "+answer+" /EI");
        textView3.setVisibility(View.VISIBLE);
        textView20.setText("© GCEK CIVIL DEPT.");
        textView20.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main212);
    }
}
