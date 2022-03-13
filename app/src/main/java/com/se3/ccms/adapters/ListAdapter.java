package com.se3.ccms.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.se3.ccms.R;
import com.se3.ccms.User;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<User>{

    public ListAdapter(Context context, ArrayList<User> userArrayList){

        super(context, R.layout.list_item, userArrayList);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        User user = getItem(position);

        if (convertView == null){

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);

        }

        ImageView imageView = convertView.findViewById(R.id.profile_pic);
        TextView userName = convertView.findViewById(R.id.personName);
        TextView lastMsg = convertView.findViewById(R.id.lastmessage);
        TextView time = convertView.findViewById(R.id.msgtime);

        imageView.setImageResource(user.getImageId());
        userName.setText(user.getName());
        lastMsg.setText(user.getLastMsgTime());
        time.setText(user.getLastMessage());



        return convertView;
    }
}