package org.example.Homework1.Book;


public class Book implements Displayable {
    private String name;//Названия
    private String autor;//автор
    private int year;//год

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void display() {
        System.out.println("Навание у книги: " + this.name);
        System.out.println("Автор книги" + this.autor);
        System.out.println("Год книги:" + this.year);
    }
}
