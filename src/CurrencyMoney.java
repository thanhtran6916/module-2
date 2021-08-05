import java.util.Scanner;

public class CurrencyMoney {
    public static void main(String[] args) {
        double rate = 23000;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input USD money");
        double usdMoney = sc.nextFloat();

        double vndMoney = usdMoney * rate;
        System.out.println("Result: " + vndMoney + " VND");
    }
}
