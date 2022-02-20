package ru.narushev.clicker;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JButton;

public class ClickerApplication {

    public static void clicker(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Кликер");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("click");
        frame.add(button);
        MyMouse listener = new MyMouse();
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
    static class MyMouse extends MouseAdapter {
        int total = 0;
        public void mouseClicked(MouseEvent e){
            int randomInt = new Random().ints(1, 1, 6).findFirst().getAsInt();
            System.out.println("Сила клика: " + randomInt);
            System.out.println("Всего: " + (total += randomInt));

        }
    }
}