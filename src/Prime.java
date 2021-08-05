import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Input Number");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number < 2) {
            System.out.println("Number is not Prime");
        } else if (number == 2) {
            System.out.println("Number is a Prime");
        } else {
            if (isPrime(number)) {
                System.out.println("Number is a Prime");
            } else {
                System.out.println("Number is not a Prime");
            }
        }
    }
    public static boolean isPrime(int number) {
        boolean flag = true;
        int i = 2;
        while (i < number) {
            if (number % i == 0) {
                flag = false;
                break;
            }
            i++;
        }
        return flag;
    }
}
