package chap06.item34;

public enum Planet {
    MERCURY(3.302e+23, 2.439e6),
    VENUS(4.869e+24, 6.052e6);

    private final double mass;
    private final double radius;
    private final double surfaceGracity;

    private static final double G = 6.67300E-11;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
        surfaceGracity = G * mass / (radius * radius);
    }

    public double mass() {
        return mass;
    }

    public double redius() {
        return radius;
    }

    public double surfaceGracity() {
        return surfaceGracity;
    }

    public double surfaceWeight(double mass) {
        return mass * surfaceGracity;
    }
}
