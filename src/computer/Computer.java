package computer;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private int cpu;
    private int ram;
    private int hdd;
    private int resource;
    private boolean on = false;

    public Computer(int cpu, int ram, int hdd, int resource) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.resource = resource;
    }

    public void displayInfo() {
        System.out.println("cpu = " + cpu);
        System.out.println("ram = " + ram);
        System.out.println("hdd = " + hdd);
    }

    public void turnOn() {
        if (on == false) {
            if (resource > 0) {
                if (failure()) {
                    System.out.println("Компьютер сгорел");
                    resource = 0;
                } else {
                    on = true;
                    System.out.println("Компьютер включен");
                }
            } else {
                System.out.println("Компьютер сгорел");
            }
        } else {
            System.out.println("Компьтер уже включен");
        }
    }

    public void turnOff() {
        if (on == true) {
            if (resource > 0) {
                if (failure()) {
                    System.out.println("Компьютер сгорел");
                    resource = 0;
                } else {
                    on = false;
                    System.out.println("Компьютер выключен");
                    resource = resource - 1;
                }
            } else {
                System.out.println("Компьютер сгорел");
            }
        } else {
            System.out.println("Компьтер уже выключен");
        }
    }

    public boolean isOn() {
        return on;
    }

    private boolean failure() {
        Random r = new Random();
        int rnd = r.nextInt(4);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int guess = sc.nextInt();
        return rnd == guess;
    }
}
