package circle3;

class Circle extends Shap{
    public double radius = 1;

    public Circle() {

    }

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "color=" + getColor()+
                '}';
    }

    @Override
    public double getArea() {
        return 0;
    }
}
