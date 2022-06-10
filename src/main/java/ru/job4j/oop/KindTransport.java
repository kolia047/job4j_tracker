package ru.job4j.oop;

public class KindTransport {

    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle bus = new Bus();
        Vehicle train = new Train();

        Vehicle[] result = new Vehicle[]{airplane, bus, train};
        for (Vehicle v : result) {
            v.move();
        }
    }
}
