package com.se3.ccms.adapters;

public class BookAdapter {
    private String idpost;
    private String iduser;
    private String idreservation;
    private String name;
    private String duration;
    private String price;

    public BookAdapter(String idpost, String iduser, String idreservation, String name, String duration, String price){

        this.idreservation = idreservation;
        this.idpost = idpost;
        this.iduser = iduser;
        this.name = name;
        this.price = price;
    }

    public String getIdpost() {
        return idpost;
    }

    public void setIdpost(String idpost) {
        this.idpost = idpost;
    }

    public String getIduser() {
        return iduser;
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

    public String getIdreservation() {
        return idreservation;
    }

    public void setIdreservation(String idreservation) {
        this.idreservation = idreservation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
