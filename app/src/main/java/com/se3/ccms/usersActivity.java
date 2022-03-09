package com.se3.ccms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Toast;

import com.se3.ccms.databinding.ActivityMainBinding;
import com.se3.ccms.databinding.ActivityUsersBinding;

import java.util.ArrayList;

public class usersActivity extends AppCompatActivity {

    public ImageView imageView;

    ActivityUsersBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUsersBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = this.getIntent();

        if (intent != null) {

            String name = intent.getStringExtra("name");
            String phone = intent.getStringExtra("phone");
            String country = intent.getStringExtra("country");
            int imageid = intent.getIntExtra("imageid", R.drawable.wolf);

            binding.nameProfile.setText(name);
            binding.phoneProfile.setText(phone);
            binding.countryProfile.setText(country);
            binding.profileImage.setImageResource(imageid);


        }
    }

    public void profil(View view){
        startActivity(new Intent(this, MainActivity2.class));
        Toast.makeText(this, "list of users", Toast.LENGTH_SHORT).show();
        finish();
    }

    }

