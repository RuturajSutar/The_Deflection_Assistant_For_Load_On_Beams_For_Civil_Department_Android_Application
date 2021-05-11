package com.example.thedeflectionassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button ssb=(Button)findViewById(R.id.button3);
        Button cb=(Button)findViewById(R.id.button4);
        ssb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ssb1=new Intent(MainActivity.this,Main2Activityssblc.class);
                startActivity(ssb1);
            }
        });
        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cb1=new Intent(MainActivity.this,Main2Activitycblc.class);
                startActivity(cb1);
            }
        });

    }
}
