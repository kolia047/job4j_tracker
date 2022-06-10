package ru.job4j.tracker;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Маршрут 15");
    }

    @Override
    public void passengers(int numberPassengers) {
        System.out.println("Количесто пассажиров - " + numberPassengers);
    }

    @Override
    public int fill(int numberFill) {
        return numberFill * 35;
    }
}
