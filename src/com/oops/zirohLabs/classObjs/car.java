package com.oops.zirohLabs.classObjs;

public class car {
    public String company;
    public String model;

    public car(String company, String model) {
        this.company = company;
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void start() {
        System.out.println("company"+ this.company +"model"+ this.getModel());
    }
}
