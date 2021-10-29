package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FirstGUI extends JFrame implements MouseListener
{

    JButton button1 = new JButton("magic place");
    JButton button2 = new JButton("magic place");
    JButton button3 = new JButton("magic place");
    JButton button4 = new JButton("magic place");
    JButton button5 = new JButton("magic place");
    JLabel label1 = new JLabel("Result: "+0+" X "+0);
    JLabel label2 = new JLabel("Last Scorer: N/A");
    JLabel label3 = new JLabel("");
    Label labelwinner = new Label("Winner: DRAW");
    private int clicks =0;
    private int clicks2 =0;

    public FirstGUI()
    {
        super("Example");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        getContentPane().add(panel);
        setPreferredSize(new Dimension(500, 400));
        panel.add((button1), BorderLayout.WEST);
        panel.add((button2), BorderLayout.EAST);
        panel.add((button3), BorderLayout.SOUTH);
        panel.add((button4), BorderLayout.NORTH);
        panel.add((button5), BorderLayout.CENTER);
    }
    public static void main(String[]args)
    {
        new FirstGUI().setVisible(true);
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
        button1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Insertsome text","place",JOptionPane.PLAIN_MESSAGE);
            }
        });
    }


    @Override
    public void mouseExited(MouseEvent e) {

    }
}

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



















