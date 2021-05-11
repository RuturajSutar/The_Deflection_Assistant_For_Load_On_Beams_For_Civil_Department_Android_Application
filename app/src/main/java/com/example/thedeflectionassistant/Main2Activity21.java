package com.example.thedeflectionassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity21 extends AppCompatActivity {

    double w,l,a,x,y,z,u,answer;
    public void calculation(View view){
        EditText editText=(EditText)findViewById(R.id.editText);
        EditText editText2=(EditText)findViewById(R.id.editText2);
        EditText editText3=(EditText)findViewById(R.id.editText3);
        w=Double.parseDouble(editText.getText().toString());
        l=Double.parseDouble(editText2.getText().toString());
        a=Double.parseDouble(editText3.getText().toString());
        x=(w*a*a*a)/3;
        y=(l-a);
        z=(w*a*a)/2;
        answer=x+(y*z);
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
        setContentView(R.layout.activity_main221);
    }
}
