package triangle;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập vào các cạnh và màu sắc hình tam giác");
        Triangle triangle = inputTriangle();

        int choose = -1;
        do {
            displayMenu();
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println(triangle.getArea());
                    System.out.println("Nhập tùy chọn khác");
                    break;
                case 2:
                    System.out.println(triangle.getPerimeter());
                    System.out.println("Nhập tùy chọn khác");
                    break;
                case 3:
                    System.out.println(triangle.toString());
                    System.out.println("Nhập tùy chọn khác");
                    break;
            }
        } while (choose != 0);
    }

    public static void displayMenu() {
        System.out.println("Nhập các tùy chọn tính toán từ số 0 đến số 3");
        System.out.println("1. Tính diện tích");
        System.out.println("2. Tính chu vi");
        System.out.println("3. Hiển thị thông tin hình tam giác");
        System.out.println("0. Exit");
    }

    public static Triangle inputTriangle() {
        System.out.println("Side 1");
        double side1 = scanner.nextDouble();
        System.out.println("Side 3");
        double side2 = scanner.nextDouble();
        System.out.println("Side 2");
        double side3 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Color");
        String color = scanner.nextLine();
        Triangle triangle = new Triangle(side1, side2, side3, color);
        System.out.println(triangle);
        return triangle;

    }
}


