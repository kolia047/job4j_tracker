package ru.job4j.oop;

public class Computer {
    private boolean multiMonitor;
    private int ssd;
    private String cpu;

    public Computer(boolean multiMonitor, int ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;

    }
    public Computer(){

    }

public void printInfo() {
    System.out.println("Много мониторов: " + multiMonitor);
    System.out.println("SSD: " + ssd + " GB");
    System.out.println("Модель CPU: " + cpu);
}
    public static void main(String[] args) {
        Computer computer = new Computer(true, 256, "AMD Ryzen 5 3600");
        computer.printInfo();
        Computer pc1 = new Computer(true, 512, "Interl core 5");
        pc1.printInfo();
        Computer pc2 = new Computer();
        pc2.printInfo();


    }

}
