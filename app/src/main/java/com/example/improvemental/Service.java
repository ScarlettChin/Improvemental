package com.example.improvemental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Service extends AppCompatActivity implements View.OnClickListener {
    Button service;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);


        service=(Button)findViewById(R.id.btnMoreInformationIndividual);
        service.setOnClickListener((View.OnClickListener) this);
    }


@Override
    public void onClick(View view){
       Intent intent= new Intent(Service.this,ServiceInfoIndividual.class);
       startActivity(intent);
}
}