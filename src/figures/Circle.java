package figures;

public class Circle extends Figure {
    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * radius * radius;
    }

    public double getArea2() {
        return 2 * Math.PI * radius * radius;
    }
}
