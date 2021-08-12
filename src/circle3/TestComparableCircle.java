package circle3;

import java.util.Arrays;

public class TestComparableCircle {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(2, "red");
        circles[1] = new ComparableCircle(5, "red");
        circles[2] = new ComparableCircle(3, "red");

        System.out.println("Trước khi sắp xếp");
        displayArrCircle(circles);

        Arrays.sort(circles);

        System.out.println("Sau khi sắp xếp");
        displayArrCircle(circles);


    }
    public static void displayArrCircle(Circle[] circles) {
        for (Circle value : circles) {
            System.out.println(value);
        }
    }
}
