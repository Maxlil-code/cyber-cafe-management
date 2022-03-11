package com.se3.ccms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class profilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
    }

    public void users(View view){
        startActivity(new Intent(this, MainActivity2.class));
        Toast.makeText(this, "list of users", Toast.LENGTH_SHORT).show();
        finish();
    }

    public void create_users(View view){
        startActivity(new Intent(this, MainActivity2.class));
        Toast.makeText(this, "user created succesfully", Toast.LENGTH_SHORT).show();
        finish();
    }

}
