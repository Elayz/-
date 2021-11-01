package com.company;

public class Main {

    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        /*System.out.println(s1); // which version?
        System.out.println(s1.getColor("blue"));
        System.out.println(s1.isFilled(false));
        System.out.println(s1.getRadius()); Этого метода нет в файле Shape*/
        System.out.println(s1.info());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getArea());

        /*Circle c1 = (Circle)s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor("blue"));
        System.out.println(c1.isFilled(false));
        System.out.println(c1.info());*/

        //Shape s2 = new Rectangle();

        Shape s3 = new Rectangle(46, "RED", 33); // Upcast
       /* System.out.println(s3);
        System.out.println(s3.getColor("RED"));*/
        System.out.println(s3.info());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getArea());


        /*Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor("RED"));
        System.out.println(r1.getLength(20));*/
        Rectangle s4 = new Square(51,"green"); // Upcast
        //System.out.println(s4);
        System.out.println(s4.info());
        System.out.println(s4.getArea());
        System.out.println(s4.getPerimeter());
        //System.out.println(s4.getColor("green"));
    }
}
