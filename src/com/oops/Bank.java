package com.oops;

public class Bank {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                '}';
    }
}
