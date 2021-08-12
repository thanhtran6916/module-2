package circle3;

import java.util.Arrays;

public class TestComparatorCicle {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(2, "red");
        circles[1] = new Circle(5, "blue");
        circles[2] = new Circle(3, "yellow");

        System.out.println("Trước khi sắp xếp");
        displayArrCircle(circles);

        ComparatorCircle comparatorCircle = new ComparatorCircle();
        Arrays.sort(circles, comparatorCircle);

        System.out.println("Sau khi sắp xếp");
        displayArrCircle(circles);
    }

    public static void displayArrCircle(Circle[] circles) {
        for (Circle value : circles) {
            System.out.println(value);
        }
    }
}
