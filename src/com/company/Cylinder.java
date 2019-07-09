package com.company;

public class Cylinder extends Circle {
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder() {
    }

    public Cylinder(double radius, String color) {
        super(radius, color);
    }
    public double getVolum(){
        return  getRadius() * getRadius() * Math.PI * getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height + " V = " + getVolum()+
                '}';
    }
}
