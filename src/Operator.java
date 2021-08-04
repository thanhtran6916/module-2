import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length: (mm)");
        float length = sc.nextFloat();

        System.out.println("Enter width: (mm)");
        float width = sc.nextFloat();

        float result = length * width;
        System.out.println("Area is: " + result + "mm2");
    }
}
