package com.example.improvemental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button MainActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainActivity=(Button)findViewById(R.id.bookbutton2);
        MainActivity.setOnClickListener((View.OnClickListener) this);
    }

    public void oneClick(View view) {
        Intent intent = new Intent(MainActivity.this, Home.class);
        startActivity(intent);
    }
}