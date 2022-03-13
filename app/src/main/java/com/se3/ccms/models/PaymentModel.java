package com.se3.ccms.models;

import com.google.gson.annotations.SerializedName;

public class PaymentModel {


    private int idpayment;
    private UserModel iduser;
    private String name;
    private String description;
    private String transactionname;

    public int getIdpayment() {
        return idpayment;
    }

    public void setIdpayment(int idpayment) {
        this.idpayment = idpayment;
    }

    public UserModel getIduser() {
        return iduser;
    }

    public void setIduser(UserModel iduser) {
        this.iduser = iduser;
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

    public String getTransactionname() {
        return transactionname;
    }

    public void setTransactionname(String transactionname) {
        this.transactionname = transactionname;
    }
}
