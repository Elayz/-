package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FirstGUI extends JFrame implements MouseListener{
    JLabel label;
    FirstGUI(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);


        Label label1 = new Label("magic place1");
        Label label2 = new Label("magic place2");
        Label label3 = new Label("magic place3");
        Label label4 = new Label("magic place4");
        Label label5 = new Label("magic place5");
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        getContentPane().add(panel);
        setPreferredSize(new Dimension(500, 400));
        panel.add((label1), BorderLayout.WEST);
        label1.setBackground(Color.RED);
        panel.add((label2), BorderLayout.EAST);
        label2.setBackground(Color.GREEN);
        panel.add((label3), BorderLayout.SOUTH);
        label3.setBackground(Color.BLUE);
        panel.add((label5), BorderLayout.NORTH);
        label4.setBackground(Color.YELLOW);
        panel.add((label4), BorderLayout.CENTER);
        label5.setBackground(Color.BLACK);
        label1.addMouseListener(this);
        label2.addMouseListener(this);
        label3.addMouseListener(this);
        label4.addMouseListener(this);
        label5.addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
    label.setBackground(Color.BLUE);
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
/*{
    Label label1 = new Label("magic place1");
    Label label2 = new Label("magic place2");
    Label label3 = new Label("magic place3");
    Label label4 = new Label("magic place4");
    Label label5 = new Label("magic place5");

    public FirstGUI()
    {
        super("Desert");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        getContentPane().add(panel);
        setPreferredSize(new Dimension(500, 400));
        panel.add((label1), BorderLayout.WEST);
        label1.setBackground(Color.RED);
        panel.add((label2), BorderLayout.EAST);
        label2.setBackground(Color.GREEN);
        panel.add((label3), BorderLayout.SOUTH);
        label3.setBackground(Color.BLUE);
        panel.add((label5), BorderLayout.NORTH);
        label4.setBackground(Color.YELLOW);
        panel.add((label4), BorderLayout.CENTER);
        label5.setBackground(Color.BLACK);
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
            label1.setBackground(Color.MAGENTA);
    }


    @Override
    public void mouseExited(MouseEvent e) {

    }
}
*/
/*
public class FirstGUI extends JFrame {


    public static void FirstGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JButton northButton = new JButton();
        panel.add(northButton, BorderLayout.NORTH);

        JButton southButton = new JButton();
        panel.add(southButton, BorderLayout.SOUTH);

        JButton eastButton = new JButton();
        panel.add(eastButton, BorderLayout.EAST);

        JButton westButton = new JButton();
        panel.add(westButton, BorderLayout.WEST);

        JButton centerButton = new JButton();
        panel.add(centerButton, BorderLayout.CENTER);

        frame.getContentPane().add(panel);
        frame.setPreferredSize(new Dimension(500, 400));

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                FirstGUI();
            }

        });
        new FirstGUI().setVisible(true);
    }

}
*/
/*
class FirstGUI extends JFrame implements MouseListener
{
    JLabel label;
    FirstGUI(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        label=new JLabel();
        label=new JLabel();
        label=new JLabel();
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
*/



















