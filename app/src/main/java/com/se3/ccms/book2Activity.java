package com.se3.ccms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class book2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book2);
    }


    public void book2(View view){
        startActivity(new Intent(this, bookActivity.class));
        Toast.makeText(this, "Enter the required information", Toast.LENGTH_SHORT).show();
        finish();
    }

    public void next(View view){
        startActivity(new Intent(this, book3Activity.class));
        Toast.makeText(this, "Online Payment", Toast.LENGTH_SHORT).show();
        finish();
    }
}