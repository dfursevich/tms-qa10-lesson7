package figures;

public class FigureRun {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(0, 0, 4, 5);
        Circle c = new Circle(0, 0, 4);
        Diamond d = new Diamond(0, 0, 3);

        printInfo(r);
        printInfo(c);
        printInfo(d);
    }

    public static void printInfo(Figure f) {
        System.out.println("Площадь фигуры равна: " + f.getArea());
    }

    public static void printInfo2(Figure f) {
        if (f instanceof Rectangle) {
            System.out.println("Площадь фигуры равна: " + ((Rectangle) f).getArea2());
        } else if (f instanceof Circle) {
            System.out.println("Площадь фигуры равна: " + ((Circle) f).getArea2());
        } else if (f instanceof Diamond) {
            System.out.println("Площадь фигуры равна: " + ((Diamond) f).getArea2());
        }
    }
}
