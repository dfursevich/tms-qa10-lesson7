package animal;

public class AnimalRun {
    public static void main(String[] args) {
        Cat cat = new Cat("Kitty", 10, "@kitty", true);

        cat.printInfo();
        cat.greet();

        Animal cat2 = new Cat("Sam", 5, "@sam", false);
        cat2.printInfo();
//        cat2.greet();
    }
}
