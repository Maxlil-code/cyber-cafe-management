package com.se3.ccms;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.se3.ccms.databinding.ActivityMain2Binding;
import com.se3.ccms.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int[] imageId = {R.drawable.wolf, R.drawable.wolf2, R.drawable.wolf3};
        String[]  name = {"Nick","Kevin","Fotso"};
        String[] lastMessage = {"Hey","Let's","Catch","Up"};
        String[] lastmsgTime = {"active", "Inactive", "active"};
        String[] phoneNo = {"657936031", "657834522","684340022"};
        String[] country = {"Cameroon", "Nigeria", "Chad"};

        ArrayList<User> userArrayList = new  ArrayList<>();

        for (int i = 0;i< imageId.length;i++){
            User user = new User(name[i], lastMessage[i], lastmsgTime[i], phoneNo[i], country[i], imageId[i]);
            userArrayList.add(user);
        }

      ListAdapter listAdapter = new ListAdapter(MainActivity2.this,userArrayList);

        binding.listview.setAdapter(listAdapter);
        binding.listview.setClickable(true);
        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){

                Intent i  =  new Intent(MainActivity2.this,usersActivity.class);
                i.putExtra("name", name[position]);
                i.putExtra("phone",phoneNo[position]);
                i.putExtra("country",country[position]);
                i.putExtra("imageid",imageId[position]);
                startActivity(i);

            }
        });


    }



}