package com.se3.ccms.models;

import com.google.gson.annotations.SerializedName;

import java.sql.Timestamp;

public class BookingModel {

    private int idreservation;
    private UserModel iduser;
    private PostModel idpost;
    private String name;
    private Timestamp duration;
    private String price;

    public int getIdreservation() {
        return idreservation;
    }

    public void setIdreservation(int idreservation) {
        this.idreservation = idreservation;
    }

    public UserModel getIduser() {
        return iduser;
    }

    public void setIduser(UserModel iduser) {
        this.iduser = iduser;
    }

    public PostModel getIdpost() {
        return idpost;
    }

    public void setIdpost(PostModel idpost) {
        this.idpost = idpost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getDuration() {
        return duration;
    }

    public void setDuration(Timestamp duration) {
        this.duration = duration;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
