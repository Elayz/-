package com.company;

public class Circle {
    //private int Diam;
    private int Rad;
    private String Name;
    public Circle(/*int D,*/ int R, String N){
        //Diam=D;
        Rad=R;
        Name=N;
    }

    public void setRad(int Rad) {this.Rad = Rad;}
    public int getRad(int Rad){return Rad;}
    /*public void setDiam(int Diam) {this.Diam = Diam;}
    public int getDiam(int Diam){return Diam;}*/
    public void setName(String Name) {this.Name = Name;}
    public String getName(String Name){return Name;}
    public void Dim(){
        int Diam;
        Diam=Rad*2;
        System.out.println("Circle name is "+Name+"\nCircle with radius of "+Rad+", the diameter is "+Diam);
    }
}
