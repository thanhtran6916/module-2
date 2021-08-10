package cricle;

public class Circle {
    private static double radius = 1.0;
    private String color = "red";

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    static double getRadius() {
        return radius;
    }

    protected String getColor() {
        return color;
    }

}
