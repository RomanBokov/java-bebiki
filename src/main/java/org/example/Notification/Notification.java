package org.example.Notification;

public class Notification {
    int num=1;

    public void notification(){
        System.out.println();
        System.out.println("Домашняя работа:" + num);
        System.out.println();
        this.num = num + 1;
    }
}
