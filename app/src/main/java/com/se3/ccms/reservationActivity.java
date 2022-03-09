package com.se3.ccms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class reservationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);
    }

    public void reservation(View view){
        startActivity(new Intent(this, MainActivity.class));
        Toast.makeText(this, "Dashboard", Toast.LENGTH_SHORT).show();
        finish();
    }
}