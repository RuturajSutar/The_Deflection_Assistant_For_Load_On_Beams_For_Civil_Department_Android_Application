package com.example.thedeflectionassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity14 extends AppCompatActivity {

    double w,l,a,b,answer,x,y,z;
    public void calculation(View view){
        EditText editText=(EditText)findViewById(R.id.editText);
        EditText editText2=(EditText)findViewById(R.id.editText2);
        EditText editText3=(EditText)findViewById(R.id.editText3);
        EditText editText4=(EditText)findViewById(R.id.editText4);
        w=Double.parseDouble(editText.getText().toString());
        l=Double.parseDouble(editText2.getText().toString());
        a=Double.parseDouble(editText3.getText().toString());
        b=Double.parseDouble(editText4.getText().toString());
        x=(l*l)-(b*b);
        y=Math.sqrt(x);
        z=y*y*y;
        answer=(w*b*z)/(9*1.73*l);
        TextView textView3=(TextView)findViewById(R.id.textView3);
        TextView textView20=(TextView)findViewById(R.id.textView20);
        textView3.setText("Answer is "+answer+" /EI");
        textView3.setVisibility(View.VISIBLE);
        textView20.setText("© GCEK CIVIL DEPT.");
        textView20.setVisibility(View.VISIBLE);
    }

    public void calculations(View view){
        EditText editText=(EditText)findViewById(R.id.editText);
        EditText editText2=(EditText)findViewById(R.id.editText2);
        EditText editText3=(EditText)findViewById(R.id.editText3);
        EditText editText4=(EditText)findViewById(R.id.editText4);
        w=Double.parseDouble(editText.getText().toString());
        l=Double.parseDouble(editText2.getText().toString());
        a=Double.parseDouble(editText3.getText().toString());
        b=Double.parseDouble(editText4.getText().toString());
        answer=(w*a*a*b*b)/(3*l);
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
        setContentView(R.layout.activity_main214);
    }
}
