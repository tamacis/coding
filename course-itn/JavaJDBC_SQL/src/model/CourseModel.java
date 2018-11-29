/*
 * Copyright (c) 2018 Cswl Coldwind <cswl1337@gmail.com>
 * Licensed under the (CC BY-SA 4.0) license
 */
package model;

/**
 *
 * @author cswl
 */
public class CourseModel {

    private int id;
    private String title;
    private double price;
    private String duration;

    public CourseModel() {
    }

    public CourseModel(String title, double price, String duration) {
        this(0, title, price, duration);
    }

    public CourseModel(int id, String title, double price, String duration) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
