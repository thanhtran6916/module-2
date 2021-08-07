package Rectangle;

public class Rectangle {
    double width, height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return 2 * (this.height + this.width);
    }

    public String displayRectangle() {
        return "Rectangle width = " + this.width + " and height = " + this.height;
    }
}
