import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào các cạnh của tam giác");
        System.out.println("Nhập cạnh thứ nhất");
        int a = scanner.nextInt();
        System.out.println("Nhập cạnh thứ hai");
        int b = scanner.nextInt();
        System.out.println("Nhập cạnh thứ ba");
        int c = scanner.nextInt();
        String notification = TriangleClassifier.triangle(a, b, c);
        System.out.println(notification);
    }
}
