import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        convertTemperature();
    }

    static void menu() {
        System.out.println("Menu");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        System.out.println();
        System.out.println("Enter your choose");
    }

    static void convertTemperature() {
        menu();
        Scanner sc = new Scanner(System.in);
        int inputChoose = -1;

        while (inputChoose != 0) {
            inputChoose = sc.nextInt();
            if (inputChoose == 1) {
                System.out.println("Fahrenheit");
                int inputF = sc.nextInt();
                float result = fToC(inputF);
                System.out.println("Result: " + result);
                menu();
            } else if (inputChoose == 2) {
                System.out.println("Celsius");
                int inputC = sc.nextInt();
                float result = cToF(inputC);
                System.out.println("Result: " + result);
                menu();
            }
        }
        System.out.println("Exit");
    }

    static float cToF(float c) {
        float result = (9 * c) / 5 + 32;
        return result;
    }

    static float fToC(float f) {
        float result = ((f - 32) * 5) / 9;
        return result;
    }
}
