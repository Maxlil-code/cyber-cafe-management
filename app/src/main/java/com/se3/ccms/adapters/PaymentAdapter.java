package com.se3.ccms.adapters;

public class PaymentAdapter {
    private String idpayment;
    private String iduser;
    private String name;
    private String description;
    private String transactionname;

    public PaymentAdapter(String idpayment, String iduser, String name,String description, String transactionname){
        this.idpayment = idpayment;
        this.iduser = iduser;
        this.name = name;
        this.description = description;
        this.transactionname = transactionname;
    }

    public String getIdpayment() {
        return idpayment;
    }

    public void setIdpayment(String idpayment) {
        this.idpayment = idpayment;
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
