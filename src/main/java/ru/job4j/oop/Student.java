package ru.job4j.oop;

public class Student {

    public void song() {
        System.out.println("I believe I can fly");
    }

    public void mesic() {
        System.out.println("Tra, tra, tra");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        for (int i = 0; i < 3; i++) {
            petya.mesic();
            petya.song();
        }
    }
}
