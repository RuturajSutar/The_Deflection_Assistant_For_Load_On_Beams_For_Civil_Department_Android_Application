package com.example.thedeflectionassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activitycblc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_activitycblc);
        Button cb1=(Button)findViewById(R.id.button);
        Button cb2=(Button)findViewById(R.id.button2);
        Button cb3=(Button)findViewById(R.id.button5);
        Button cb4=(Button)findViewById(R.id.button6);
        cb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ssb11=new Intent(Main2Activitycblc.this,Main2Activity21.class);
                startActivity(ssb11);
            }
        });
        cb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ssb11=new Intent(Main2Activitycblc.this,Main2Activity22.class);
                startActivity(ssb11);
            }
        });
        cb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ssb11=new Intent(Main2Activitycblc.this,Main2Activity23.class);
                startActivity(ssb11);
            }
        });
        cb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ssb11=new Intent(Main2Activitycblc.this,Main2Activity24.class);
                startActivity(ssb11);
            }
        });
    }
}
