package com.example.improvemental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ServiceInfoIndividual extends AppCompatActivity {

    Button ServiceInfoIndividual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_info_individual);

        ServiceInfoIndividual=(Button)findViewById(R.id.bookbutton2);
        ServiceInfoIndividual.setOnClickListener((View.OnClickListener) this);
    }


    public void oneClick(View view) {
        Intent intent= new Intent(ServiceInfoIndividual.this,Booking.class);
        startActivity(intent);
    }
}