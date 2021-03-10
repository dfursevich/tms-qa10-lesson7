package figures;

public class Diamond extends Figure {
    private int a;

    public Diamond(int x, int y, int a) {
        super(x, y);
        this.a = a;
    }

    @Override
    public double getArea() {
        return a * a;
    }

    public double getArea2() {
        return a * a;
    }
}
