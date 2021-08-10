package car;

public class Car {
    private String name;
    private String color;
    public static int carNumberCount = 0;

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
        carNumberCount++;
    }

    public String toString() {
        return "Car " + this.name + " " + this.color + " is number car " + carNumberCount;
    }
}
