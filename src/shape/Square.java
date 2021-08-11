package shape;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double width) {
        this.setSide(width);
    }

    @Override
    public void setLength(double length) {
        this.setSide(length);
    }

    @Override
    public String toString() {
        return "A Aquare with side = " + getSide() + ", which is a subclass of " + super.toString();
    }

}
