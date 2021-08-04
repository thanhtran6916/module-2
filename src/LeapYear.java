import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input year?");
        int inputYear = sc.nextInt();

        if ((inputYear % 4 == 0 && inputYear % 100 != 0) || (inputYear % 100 == 0 && inputYear % 400 == 0)) {
            System.out.printf("%d is leap year!", inputYear);
        } else {
            System.out.printf("%d is not a leap year", inputYear);
        }
    }
}
