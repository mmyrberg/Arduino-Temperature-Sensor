package com.example.thymeleaf;

public class Temps {
    protected int id;
    protected float temp;
    protected String date;

    public Temps(){}

    public Temps(int id, float temp, String date) {
        this.id = id;
        this.temp = temp;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
