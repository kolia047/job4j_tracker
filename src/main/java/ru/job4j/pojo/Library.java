package ru.job4j.pojo;

import java.util.Arrays;

public class Library {

    public static void main(String[] args) {

        Book book1 = new Book("История успеха", 52);
        Book book2 = new Book("Clean code", 169);
        Book book3 = new Book("Богатый папа", 250);
        Book book4 = new Book("Бедный папа", 210);

        Book[] books = new Book[]{book1, book2, book3, book4};
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getNumber() + " стр.");
        }
        System.out.println("");
        Book transwer = books[0];
        books[0] = books[3];
        books[3] = transwer;

        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getNumber() + " стр.");
        }
        System.out.println("");
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getName() + " - " + bk.getNumber());
            }
        }
    }
}


