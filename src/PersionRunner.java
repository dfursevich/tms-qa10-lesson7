import java.util.Random;

public class PersionRunner {

    public static void main(String[] args) {
        Object p = new Person("sam", 20);
        System.out.println(p);
        System.out.println(p.toString());

//        Object p = new Random();

        if (p instanceof Person) {
            Person p2 = (Person) p;
            System.out.println(p2.toString());
        }
    }
}
