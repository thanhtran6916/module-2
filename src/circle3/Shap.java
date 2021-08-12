package circle3;

abstract class Shap {
    String color = "red";

    public Shap() {}

    public Shap(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();

}
