package ex_2;

public class MfChair implements IfChair {
    private final double width, length, height;
    private double x, y;

    public MfChair(double width, double length, double height) {
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
