package com.company;

public class Square extends Rectangle {
    public Square(double side, String color){
        this.length = side;
        this.width = side;
        this.color = color;
    }
    public  double getSide(){
      return length;
    }
    public void setSide(double side){
        this.length = side;
        this.width = side;
    }
    @Override
    public void setWidth(double side) {
        this.width=side;
    }
    @Override
    public double getWidth() {
        return width;
    }
    @Override
    public void setLength(double side) {
        this.length=side;
    }
    @Override
    public double getLength() {
        return length;
    }
    public String info() {
        return "Square:side: "+length+" Square area = "+(length*length)+", perimeter= "+(length+length)+", color: "+color;
    }

}
