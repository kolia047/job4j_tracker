package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        /* Приведение к родителю student */
        Student student = freshman;
        /* Приведение к родителю Object */
        Object obj = freshman;
        Student student1 = new Freshman();
        Object obj1 = new Freshman();
        /* Это повышающее приведение up casting */
    }
}
