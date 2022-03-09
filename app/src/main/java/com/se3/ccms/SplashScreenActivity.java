package com.se3.ccms;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.VideoView;

public class SplashScreenActivity extends AppCompatActivity {

    VideoView videoView;
    Button button;
    ImageView imageView;

   @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        setContentView(R.layout.activity_splash_screen);

        button = findViewById(R.id.nextActivity);
        videoView = findViewById(R.id.viewVideo);
        imageView = findViewById(R.id.image);

        String path = "android.resource://com.se3.ccms/"+R.raw.ink_water;

        Uri uri = Uri.parse(path);
        videoView.setVideoURI(uri);
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.start();
                imageView.setVisibility(View.GONE);
            }
        });

                //if you want video to play again and again
      videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
          @Override
          public void onCompletion(MediaPlayer mediaPlayer) {
              mediaPlayer.start();
          }
      });

                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(SplashScreenActivity.this, loginActivity.class));

                        finish();
                    }
                });
    }

    public void onClick(View view) {
        Toast.makeText(this, "welcome to the CCMS platform", Toast.LENGTH_SHORT).show();
    }
}