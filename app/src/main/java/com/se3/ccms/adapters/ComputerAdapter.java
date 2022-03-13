package com.se3.ccms.adapters;

public class ComputerAdapter {
    private String idcomputer;
    private String name;
    private String description;
    private String creationdate;
    private String status;

    public ComputerAdapter(String idcomputer, String name,  String description, String creationdate, String status){
        this.idcomputer = idcomputer;
        this.name = name;
        this.description = description;
        this.creationdate = creationdate;
        this.status = status;

    }
    public String getIdcomputer() {
        return idcomputer;
    }

    public void setIdcomputer(String idcomputer) {
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

    public String getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(String creationdate) {
        this.creationdate = creationdate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
