package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FirstGUI extends JFrame {
    public void FirstGUI() {

    }
    public  FirstGUI(){
        super("hi");
        setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setBackground(Color.DARK_GRAY);
    }
    public void paint (Graphics paint){
        int r = (int)(Math.random()*255);
        int g = (int)(Math.random()*255);
        int b = (int)(Math.random()*255);
        paint.setColor(new Color(r,r,r));
        paint.fillOval(20,32,50,50);
        paint.setColor(new Color(r,r,g));
        paint.fillRect(75,32,50,50);
        paint.setColor(new Color(r,r,b));
        paint.fillOval(130,32,50,40);
        paint.setColor(new Color(r,b,r));
        paint.fillRect(185,32,50,50);
        paint.setColor(new Color(r,b,g));
        paint.fillOval(240,32,50,40);
        paint.setColor(new Color(r,b,b));
        paint.fillRect(295,32,50,50);
        paint.setColor(new Color(g,r,r));
        paint.fillOval(350,32,50,40);
        paint.setColor(new Color(g,r,g));
        paint.fillOval(405,32,50,50);
        paint.setColor(new Color(g,r,b));
        paint.fillRect(20,87,50,50);
        paint.setColor(new Color(g,g,r));
        paint.fillOval(75,87,50,40);
        paint.setColor(new Color(g,g,g));
        paint.fillRect(130,87,50,50);
        paint.setColor(new Color(g,g,b));
        paint.fillOval(185,87,50,40);
        paint.setColor(new Color(b,r,r));
        paint.fillRect(240,87,50,50);
        paint.setColor(new Color(b,b,b));
        paint.fillOval(295,87,50,40);
    }
}