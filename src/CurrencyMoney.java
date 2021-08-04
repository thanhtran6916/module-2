import java.util.Scanner;

public class CurrencyMoney {
    public static void main(String[] args) {
        float rate = 23000L;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input USD money");
        float usdMoney = sc.nextFloat();

        float vndMoney = usdMoney * rate;
        System.out.println("Result: " + vndMoney + " VND");
    }
}
