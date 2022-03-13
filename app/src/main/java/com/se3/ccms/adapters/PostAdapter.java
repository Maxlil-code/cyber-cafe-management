package com.se3.ccms.adapters;

public class PostAdapter {
    private String idpost;
    private String iduser;
    private String idcomputer;
    private String postnumber;
    private String status;
    private String description;


    public PostAdapter(String idpost, String iduser, String idcomputer, String postnumber, String status, String description) {
        this.idpost = idpost;
        this.iduser = iduser;
        this.idcomputer = idcomputer;
        this.postnumber = postnumber;
        this.status = status;
        this.description = description;

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

    public String getIdcomputer() {
        return idcomputer;
    }

    public void setIdcomputer(String idcomputer) {
        this.idcomputer = idcomputer;
    }

    public String getPostnumber() {
        return postnumber;
    }

    public void setPostnumber(String postnumber) {
        this.postnumber = postnumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
