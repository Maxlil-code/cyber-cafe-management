package com.se3.ccms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class registerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


    }

    public void onLoginClick(View view) {
        startActivity(new Intent(this, loginActivity.class));
        overridePendingTransition(R.anim.slide_in_left, R.anim.stay);
        finish();
    }

    public void sign(View view) {
        startActivity(new Intent(this, loginActivity.class));

        Toast.makeText(this, "Registered Succesfully", Toast.LENGTH_SHORT).show();

        finish();
    }
}