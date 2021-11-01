package com.company;

public class Rectangle extends Shape {
    protected double length;
    protected double width;
    public Rectangle(double len, double wid){
        length=len;
        width=wid;
    }
    public Rectangle(){
        this.filled = false;
        this.color = "red";
        length = 10;
        width=20;
    }
    public Rectangle(double width){
        this.filled = false;
        this.color = "red";
        this.width = width;
    }
    public Rectangle(double width, String color, double length){
        this.width = width;
        this.color = color;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea() {
        return length*width;
    }
    @Override
    public double getPerimeter() {
        return 2*length+width;
    }
    @Override
    public String info() {
        return "Rectangle: rectangle width: "+this.width+", color: "+this.color+", length: "+this.length;
    }
}
