package com.se3.ccms;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.se3.ccms.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        drawerLayout = findViewById(R.id.drawerlayout);
        navigationView = findViewById(R.id.navigationview);
        toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar, R.string.navigation_open, R.string.navigation_close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


    }

    public void post(View view) {
        startActivity(new Intent(this, postActivity.class));
        Toast.makeText(this, "list of Posts", Toast.LENGTH_SHORT).show();
        finish();
    }

    public void user(View view) {
        startActivity(new Intent(this, MainActivity2.class));
        Toast.makeText(this, "list of users", Toast.LENGTH_SHORT).show();
        finish();
    }

    public void setting(View view) {
        startActivity(new Intent(this, settingsActivity.class));
        Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show();
        finish();
    }

    public void reservation(View view) {
        startActivity(new Intent(this, reservationActivity.class));
        Toast.makeText(this, "Reservations", Toast.LENGTH_SHORT).show();
        finish();
    }
}

