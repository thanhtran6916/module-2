package triangle;

public class Shape {
    private String color = "red";

    public Shape() {}

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Shape color " + this.color;
    }
}
