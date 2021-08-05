import java.util.Scanner;

public class BankInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input money");
        double money = sc.nextDouble();

        System.out.println("Input time borrowed(month)");
        int time = sc.nextInt();

        System.out.println("Input interest rate(%)");
        double interestRate = sc.nextDouble();

        System.out.println("Result: " + calculateBack(time, money, interestRate) + "VND");
    }
    public static double calculateBack(int time, double money, double interestRate) {
        double totalInterest = money;
        for (int i = 0; i < time; i++) {
            totalInterest += money * ((interestRate /100) / 12);
        }
        return totalInterest;
    }
}
