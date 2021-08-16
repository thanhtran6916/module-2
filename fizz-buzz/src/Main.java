import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FizzBuzzTranslate number = new FizzBuzzTranslate();
        System.out.println("Nhập vào một số");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        String notification = number.translate(inputNumber);
        System.out.println(notification);
    }
}
