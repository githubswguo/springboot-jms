package com.example.demo.entity;

public class Account {

    private int id;
    private String name;
    private double monet;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonet() {
        return monet;
    }

    public void setMonet(double monet) {
        this.monet = monet;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", monet=" + monet +
                '}';
    }

    public Account(int id, String name, double monet) {
        this.id = id;
        this.name = name;
        this.monet = monet;
    }
}
