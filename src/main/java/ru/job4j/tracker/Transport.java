package ru.job4j.tracker;

public interface Transport {
    void drive();

    void passengers(int numberPassengers);

    int fill(int numberFill);
}
