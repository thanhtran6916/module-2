package circle2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Circle> circles = new ArrayList<>();
        circles.add(new Circle(2, "red"));
        circles.add(new Circle(8, "blue"));
        circles.add(new Circle(4, "yellow"));
        circles.add(new Circle(7, "pink"));
        circles.add(new Circle(5, "black"));

        for (Circle value : circles) {
            System.out.println(value);
        }

        Collections.sort(circles, new CircleCompareTo());

        for (Circle value : circles) {
            System.out.println(value);
        }
    }
}
