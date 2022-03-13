package com.se3.ccms.models;

import com.google.gson.annotations.SerializedName;

import java.sql.Timestamp;
import java.util.Date;

public class ComputerModel {



    private int idcomputer;
    private String name;
    private String description;
    private Date creationdate;
    private String status;

    public int getIdcomputer() {
        return idcomputer;
    }

    public void setIdcomputer(int idcomputer) {
        this.idcomputer = idcomputer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Timestamp creationdate) {
        this.creationdate = creationdate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
