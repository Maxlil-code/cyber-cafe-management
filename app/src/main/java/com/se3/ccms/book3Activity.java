package com.se3.ccms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class book3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book3);
    }

    public void book3(View view){
        startActivity(new Intent(this, book2Activity.class));
        Toast.makeText(this, "choose a post", Toast.LENGTH_SHORT).show();
        finish();
    }

    public void book4(View view){
        startActivity(new Intent(this, MainActivity.class));
        Toast.makeText(this, "Transaction Done Successfuly", Toast.LENGTH_SHORT).show();
        finish();
    }
}