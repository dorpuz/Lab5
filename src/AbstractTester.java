public class AbstractTester {

    public static void main(String[] args) {
        Shape s = new Rectangle();
        ((Rectangle) s).setLength(4);
        ((Rectangle) s).setWidth(6);
    }
}

abstract class Shape {
    private String color;

    abstract double getArea();
}

class Rectangle extends Shape {
    private int length;
    private int width;

    @Override
    double getArea() {
        return length * width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}

