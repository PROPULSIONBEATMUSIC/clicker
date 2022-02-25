package ru.narushev.springclicker;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JButton;

public class clicker {

    public static void clicker(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Кликер");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("click");
        frame.add(button);
        response.MyMouse listener = new response.MyMouse();
        button.addMouseListener((MouseListener) listener);


        frame.setPreferredSize(new Dimension(500, 500));

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                clicker();
            }
        });
    }
}
