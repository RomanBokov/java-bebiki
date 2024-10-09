package org.example.Homework1.Student;

public class Student implements Printable{
    private String name;
    private int bookStudent;
    private double avgLvl;

    public void setName(String name){
        this.name = name;
    }

    public void setAvgLvl(double avgLvl) {
        this.avgLvl = avgLvl;
    }

    public void setBookStudent(int bookStudent) {
        this.bookStudent = bookStudent;
    }

    @Override
    public void print() {
        System.out.println("Имя студента: " + this.name);
        System.out.println("Номер зачетки: " + this.bookStudent);
        System.out.println("Средний бал " + String.format("%.2f",this.avgLvl));
    }
}
