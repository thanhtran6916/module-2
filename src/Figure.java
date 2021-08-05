import java.util.Scanner;

public class Figure {
    public static void main(String[] arge) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice number:");
        System.out.println("1. Draw a rectangle");
        System.out.println("2. Draw a right triangle");
        System.out.println("3. Draw an isosceles triangle");
        System.out.println("0. Exit");
        int number = -1;

        while (number != 0) {
            number = sc.nextInt();
            switch (number) {
                case 1:
                    System.out.println(rect());
                    System.out.println("Enter choice number:");
                    System.out.println("1. Draw a rectangle");
                    System.out.println("2. Draw a right triangle");
                    System.out.println("3. Draw an isosceles triangle");
                    System.out.println("0. Exit");
                    break;
                case 2:
                    System.out.println(rightTriangle());
                    System.out.println("Enter choice number:");
                    System.out.println("1. Draw a rectangle");
                    System.out.println("2. Draw a right triangle");
                    System.out.println("3. Draw an isosceles triangle");
                    System.out.println("0. Exit");
                    break;
                case 3:
                    System.out.println(isoscelesTriangle());
                    System.out.println("Enter choice number:");
                    System.out.println("1. Draw a rectangle");
                    System.out.println("2. Draw a right triangle");
                    System.out.println("3. Draw an isosceles triangle");
                    System.out.println("0. Exit");
                    break;
            }
        }

    }

    public static String rect() {
        String result = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                result += "*";
            }
            result += "\n";
        }
        return result;
    }

    public static String rightTriangle() {
        String result = "";
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                result += "*";
            }
            result += "\n";
        }
        return result;
    }

    public static String isoscelesTriangle() {
        String  result = "";
        for (int i = 0; i < 5; i++) {
                switch (i) {
                    case 0:
                        result += "    *   ";
                        break;
                    case 1:
                        result += "   ***  ";
                        break;
                    case 2:
                        result += "  ***** ";
                        break;
                    case 3:
                        result += " ******* ";
                        break;
                    case 4:
                        result += "*********";
                        break;
                }
            result += "\n";
        }
        return result;
    }
}
