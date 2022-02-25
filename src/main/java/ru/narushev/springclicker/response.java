package ru.narushev.springclicker;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class response {
    static class MyMouse extends MouseAdapter {
        int total = 0;
        int totalClicks = 0;
        public void mouseClicked(MouseEvent e){
            int randomInt = new Random().ints(1, 1, 6).findFirst().getAsInt();
            System.out.println("Сила клика: " + randomInt);
            System.out.println("Всего: " + (total += randomInt));
            System.out.println("Всего кликов: " + totalClicks++);
        }
    }
}
