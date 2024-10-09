package org.example.Homework1.Point;

public class Point implements Movable {
    private double x;
    private double y;


    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void getX() {
        String str;
        str = "Координаты x: " + String.format("%.2f",this.x);
        System.out.println(str);

    }


    public void getY() {
        String str;
        str = "Координаты y: " + String.format("%.2f",this.y);
        System.out.println(str);

    }

    @Override
    public void moveUp(double num) {
        this.y = y + num;
    }

    @Override
    public void moveDown(double num) {
        this.y = y - num;
    }

    @Override
    public void moveLeft(double num) {
        this.x = x - num;
    }

    @Override
    public void moveRight(double num) {
        this.x = x + num;
    }

}
