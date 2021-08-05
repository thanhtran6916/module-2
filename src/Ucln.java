import java.util.Scanner;

public class Ucln {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input A");
        long inputA = sc.nextLong();
        long a = Math.abs(inputA);

        System.out.println("Input B");
        long inputB = sc.nextLong();
        long b = Math.abs(inputB);

        String result = "";
        if (checkZero(a, b)) {
            result = "Hai số không có UCLN";
        } else {
            result = "UCLN của hai số A và B là: " + ucll(a, b);
        }

        System.out.println(result);
    }

    public static boolean checkZero(long a, long b) {
        boolean result = false;
        if (a == 0 & b == 0) {
            result = true;
        }
        return result;
    }

    public static long ucll(long a, long b) {
        long result;
        if (a == 0 && b != 0) {
            result = b;
        } else if (a != 0 && b == 0) {
            result = a;
        } else {
            while (a != b) {
                if (a < b) {
                    b -= a;
                } else {
                    a -= b;
                }
            }
            result = a;
        }
        return result;
    }
}
