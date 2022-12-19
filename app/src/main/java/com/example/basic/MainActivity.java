package com.example.basic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //We can work with the button by using the variable v.
    public void disable(View v){
        Button button = findViewById(R.id.toDoListButton);
        button.setEnabled(false);
        button.setText("Disabled");

    }


}