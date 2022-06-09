package ru.job4j.io;

import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добрбо пожаловать. Как Вас Зовут");
        String name = scanner.nextLine();
        System.out.println(name + ", рад Вас видеть");
    }
}
