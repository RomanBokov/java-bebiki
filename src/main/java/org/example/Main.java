package org.example;



import org.example.Homework1.Book.Book;
import org.example.task1.BankAccount;
import org.example.Notification.Notification;



public class Main {
    static Notification num1 = new Notification();

    public static void main(String[] args){
        //пример от Саши
        BankAccount account1 = new BankAccount();
        account1.setBalance(1000);
        account1.print();

        //1 домашка
        num1.notification();
        Book book1 = new Book();
        book1.setAutor("Толстой");
        book1.setName("Война и мир");
        book1.setYear(1863);
        book1.display();

        num1.notification();

    }
}


