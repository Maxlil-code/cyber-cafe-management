package com.se3.ccms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class bookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
    }


    public void changeStatusBarColor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(getResources().getColor(R.color.register_bk_color));
        }
    }

    public void book_continue(View view) {
        startActivity(new Intent(this, book2Activity.class));
        Toast.makeText(this, "Choose a Post", Toast.LENGTH_SHORT).show();
        finish();
    }


    public void book(View view) {
        startActivity(new Intent(this, MainActivity.class));
        Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
        finish();
    }

}