package com.company;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape(String col, boolean fil){
        color=col;
        filled=fil;
    }

    protected Shape() {
    }

    public void setColor(String color){
    this.color=color;
    }
    public String getColor(){
        return color;
    }
    public boolean isFilled(boolean filled){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled=filled;

    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String info();
}
