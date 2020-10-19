enum Planets {
    MERCURY (3.301e+23, 2440),
    VENUSIAN (4.886e+24, 6052),
    EARTH   (5.976e+24, 6371),
    MARS (6.417e+24, 3396),
    JUPITER (1.89e+27, 69911),
    SATURN (5.66e+26, 60268),
    URANUS  (8.686e+25, 25362),
    NEPTUNE (1.024e+26, 24622);

    private final double mass;
    private final double radius;
    private static final double G = 6.67408E-11;
    Planets(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }
    public double getGravity() {
        return G * mass / Math.pow(radius*1000,2);
    }

}