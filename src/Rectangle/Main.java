package Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your width and height of rectangle");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your width");
        double width = scanner.nextDouble();
        System.out.println("Enter your height");
        double height = scanner.nextDouble();

        Rectangle myRectangle = new Rectangle(width, height);
        System.out.println(myRectangle.displayRectangle());
        System.out.println("Area rectangle is " + myRectangle.getArea());
        System.out.println("Perimeter rectangle is " + myRectangle.getPerimeter());
    }
}
