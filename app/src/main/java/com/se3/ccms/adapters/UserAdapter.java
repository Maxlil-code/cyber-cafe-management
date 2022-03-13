package com.se3.ccms.adapters;

public class UserAdapter {
        private String iduser;
        private String name;
        private String email;
        private String phone;
        private String login;
        private String dob;
        private String password;
        private String city;
        private String Country;
        private String status;

    public UserAdapter(String iduser, String name, String email, String phone, String login, String password, String city, String country, String status, String dob) {
        this.iduser = iduser;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.login = login;
        this.password = password;
        this.city = city;
        this.Country = country;
        this.status = status;
        this.dob = dob;
    }


    public String getIduser() {
        return iduser;
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}