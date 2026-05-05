public class Cylinder {
    private double radius;
    private double height;
    private final double PI = 3.14;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return radius * radius * height * PI;
    }

    public String toString() {
        return "Cylinder radius: " + radius + ", height: " + height;
    }
}
