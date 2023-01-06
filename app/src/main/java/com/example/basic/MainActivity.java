package com.example.basic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleText(View v){
        EditText editText = findViewById(R.id.source);
        String input = editText.getText().toString();

        TextView textView = findViewById(R.id.output);
        textView.setText(input);
        Toast.makeText(this, "Alert", Toast.LENGTH_LONG).show();
    }

    public void disable(View v){
        findViewById(R.id.button).setEnabled(false);
        ((Button)findViewById(R.id.button)).setText("Disabled");
    }

    //launch a new activity
    public void launchPage(View v){
        Intent i = new Intent(this, NewPageActivity.class);
        startActivity(i);
    }

}