package com.example.improvemental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ServiceInfoFamily extends AppCompatActivity {
    Button ServiceInfoFamily;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_info_family);

        ServiceInfoFamily=(Button)findViewById(R.id.bookbutton2);
        ServiceInfoFamily.setOnClickListener((View.OnClickListener) this);
    }

    public void oneClick(View view) {
        Intent intent = new Intent(ServiceInfoFamily.this, Booking.class);
        startActivity(intent);
    }
}