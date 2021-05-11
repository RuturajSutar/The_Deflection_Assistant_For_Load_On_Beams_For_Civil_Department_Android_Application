package com.example.thedeflectionassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activityssblc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_activityssblc);
        Button ssb1=(Button)findViewById(R.id.button);
        Button ssb2=(Button)findViewById(R.id.button2);
        Button ssb3=(Button)findViewById(R.id.button5);
        Button ssb4=(Button)findViewById(R.id.button6);
        ssb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ssb11=new Intent(Main2Activityssblc.this,Main2Activity11.class);
                startActivity(ssb11);
            }
        });
        ssb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ssb11=new Intent(Main2Activityssblc.this,Main2Activity12.class);
                startActivity(ssb11);
            }
        });
        ssb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ssb11=new Intent(Main2Activityssblc.this,Main2Activity13.class);
                startActivity(ssb11);
            }
        });
        ssb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ssb11=new Intent(Main2Activityssblc.this,Main2Activity14.class);
                startActivity(ssb11);
            }
        });
    }
}
