package figures;

public class Rectangle extends Figure {
    private int a;
    private int b;

    public Rectangle(int x, int y, int a, int b) {
        super(x, y);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    public double getArea2() {
        return a * b;
    }
}
