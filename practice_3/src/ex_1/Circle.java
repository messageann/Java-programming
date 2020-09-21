package ex_1;

public class Circle {
    private double radius;
    private double diameter;

    public Circle(double r) {
        radius = r;
    }

    public void NewProperties(double r) {
        radius = r;
    }

    public String Properties() {
        diameter = radius*2;
        return "Radius: " + radius + "\nDiameter: " + diameter;
    }

    public double Perimeter(){
        return radius*2*Math.PI;
    }

    public double Area(){
        return Math.pow(radius,2)*Math.PI;
    }
}
