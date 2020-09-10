package com.example.improvemental;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class ServiceInfoCouple extends AppCompatActivity {

    Button ServiceInfoCouple;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_info_couple);

        ServiceInfoCouple=(Button)findViewById(R.id.bookbutton3);
        ServiceInfoCouple.setOnClickListener((View.OnClickListener) this);
    }

    public void oneClick(View view) {
        Intent intent = new Intent(ServiceInfoCouple.this, Booking.class);
        startActivity(intent);
    }
}