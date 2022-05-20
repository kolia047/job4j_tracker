package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String str = "Неизвестное слово ";
        return str + eng;
    }

    public static void main(String[] args) {
        DummyDic var = new DummyDic();
        String word = "ручка";
        System.out.println(var.engToRus(word));
    }
}
