package computer;

public class ComputerRun {
    public static void main(String[] args) {
        Computer c1 = new Computer(2400, 16000, 250, 10);
        Computer c2 = new Computer(3400, 32000, 128, 10);
        Computer c3 = new Computer(3400, 32000, 128, 10);

        c1.displayInfo();
        System.out.println();
        c2.displayInfo();

        for (int i = 0; i < 30; i++) {
            c1.turnOn();
            c1.turnOff();
        }

        c2.turnOn();

//        System.out.println("c1.isOn() = " + c1.isOn());
//        c1.turnOn();
//        System.out.println("c1.isOn() = " + c1.isOn());
//        c1.turnOff();
//        System.out.println("c1.isOn() = " + c1.isOn());
    }
}
