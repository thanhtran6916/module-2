package AppSolveQuadraticEquation;

public class AppSolveQuadraticEquation {
    private double a, b, c;
    public AppSolveQuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1(double delta) {
        double result;
        result = (- this.b + Math.pow(delta, 0.5)) / (2 * this.a);
        return result;
    }

    public double getRoot2(double delta) {
        double result;
        result = (- this.b - Math.pow(delta, 0.5)) / (2 * this.a);
        return result;
    }
}
