package org.example;



import org.example.Homework1.Book.Book;
import org.example.Homework1.Car.Car;
import org.example.Homework1.Clock.Clock;
import org.example.Homework1.Student.Student;
import org.example.task1.BankAccount;
import org.example.Notification.Notification;
import org.example.Homework1.Point.Point;

import java.awt.*;


public class Main {
    static Notification notification = new Notification();

    public static void main(String[] args){
        //пример от Саши
        BankAccount account1 = new BankAccount();
        account1.setBalance(1000);
        account1.print();

        //1 домашка 1 задание
        notification.notification();
        Book book1 = new Book();
        book1.setAutor("Толстой");
        book1.setName("Война и мир");
        book1.setYear(1863);
        book1.display();
        // 1 домашка 2 задание
        notification.notification();
        Student student1 = new Student();
        student1.setName("Иван");
        student1.setBookStudent(12);
        student1.setAvgLvl(4.253325544);
        student1.print();
        //1 домашка 3 задание
        notification.notification();
        Point point1 = new Point();
        point1.setX(1.45);
        point1.setY(1.46);
        point1.getX();
        point1.getY();

        notification.notificationXY("Y", 1);
        point1.moveDown(1);
        point1.getX();
        point1.getY();

        notification.notificationXY("X", -1);
        point1.moveLeft(1);
        point1.getX();
        point1.getY();

        notification.notificationXY("X", 2);
        point1.moveRight(2);
        point1.getX();
        point1.getY();

        notification.notificationXY("Y", 2.4);
        point1.moveUp(2.4);
        point1.getX();
        point1.getY();


        // 1 домашка 4 задание
        notification.notification();
        Clock clok = new Clock();
        clok.setHh(23);
        clok.setMm(59);
        clok.setSs(58);
        clok.Readable();
        clok.tick();
        clok.Readable();
        clok.tick();
        clok.Readable();

        // 1 домашка 5 задание
        notification.notification();
        Car car = new Car();
        car.drive(5);
        car.setMarka("Ferrari");
        car.setModel("F40");
        car.setYear(2022);
        car.drive(300);
        car.start();
        car.drive(360);
        car.drive(200);
        car.stop();
        car.drive(233);
        notification.notificationCar(car);




    }

}


