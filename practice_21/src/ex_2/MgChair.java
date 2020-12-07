package ex_2;

public class MgChair implements IfChair {
    private final double width, length, height;
    private double x, y;

    public MgChair(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getHeight() {
        return height;
    }
}

