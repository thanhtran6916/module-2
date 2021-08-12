package circle2;

public abstract class Geometric {
    private String color = "red";

    public Geometric() {}

    public Geometric(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract double getArea();

    abstract double getPerimeter();
}
