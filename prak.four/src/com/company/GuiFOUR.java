package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class GuiFOUR extends JFrame
{

    JButton button1 = new JButton("AC Milan");
    JButton button2 = new JButton("Real Madrid");
    JLabel label1 = new JLabel("Result: "+0+" X "+0);
    JLabel label2 = new JLabel("Last Scorer: N/A");
    JLabel label3 = new JLabel("");
    Label labelwinner = new Label("Winner: DRAW");
    private int clicks =0;
    private int clicks2 =0;

    public GuiFOUR()
    {
        super("Example");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,2));
        add(label1);
        add(labelwinner);
        add(label2);
        add(label3);
        add(button1);
        add(button2);
        button1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            clicks++;
            label1.setText("Result: "+clicks+" X "+clicks2);
            label2.setText("Last Scorer: AC Milan");
                if (clicks2<clicks){labelwinner.setText("Winner: AC Milan");}
                if (clicks2==clicks){labelwinner.setText("Winner: DRAW");}
            }
        });
        button2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
                clicks2++;
                label1.setText("Result: "+clicks+" X "+clicks2);
                label2.setText("Last Scorer: Real Madrid");
                if (clicks2>clicks){labelwinner.setText("Winner: Real Madrid");}
            }
        });
    }
    public static void main(String[]args)
    {
        new GuiFOUR().setVisible(true);
    }
}