package org.example.Notification;

import org.example.Homework1.Car.Car;

public class Notification {
    int num=1;

    public void notification(){
        System.out.println();
        System.out.println("Домашняя работа:" + num);
        System.out.println();
        this.num = num + 1;
    }

    public void notificationXY(String vector, double point){
        System.out.println("Передвигаем по " + vector +" на " + String.format("%.2f",point));
    }

    public void  notificationCar(Car car){
        System.out.println("Марка машины: " + car.getMarka());
        System.out.println("Модель: " + car.getModel());
        System.out.println("Год выпуска: " + car.getYear());
        System.out.println("Пробег: " + car.getDistanceall());
    }

}
