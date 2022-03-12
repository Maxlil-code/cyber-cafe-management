package com.se3.ccms;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import com.google.android.material.navigation.NavigationView;
import com.se3.ccms.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView = findViewById(R.id.videoView);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.speedc);

        //help see the buttons needed to control the video (that is "play, pause")
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);


        drawerLayout = findViewById(R.id.drawerlayout);
        navigationView = findViewById(R.id.navigationview);
        toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_open, R.string.navigation_close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        navigationView.bringToFront();
        navigationView.setCheckedItem(R.id.home_menu);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.booking_menu:
                        Intent intent = new Intent(MainActivity.this, bookActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.post_menu:
                        Intent intent1 = new Intent(MainActivity.this, postActivity.class);
                        startActivity(intent1);
                        break;

                    case R.id.about_menu:
                        Intent intent3 = new Intent(MainActivity.this, aboutActivity.class);
                        startActivity(intent3);
                        break;

                    case R.id.setting_menu:
                        Intent intent2 = new Intent(MainActivity.this, settingsActivity.class);
                        startActivity(intent2);
                        break;

                    case R.id.logout:
                        Toast.makeText(MainActivity.this, "Logout succesfuly", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
    }

}



