package com.se3.ccms.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public abstract class UserModel {

    @Expose
    @SerializedName("status")
    private String status;
    @Expose
    @SerializedName("password")
    private String password;
    @Expose
    @SerializedName("name")
    private String name;
    @Expose
    @SerializedName("login")
    private String login;
    @Expose
    @SerializedName("iduser")
    private int iduser;
    @Expose
    @SerializedName("email")
    private String email;
    @Expose
    @SerializedName("dob")
    private String dob;
    @Expose
    @SerializedName("country")
    private String country;
    @Expose
    @SerializedName("city")
    private String city;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
