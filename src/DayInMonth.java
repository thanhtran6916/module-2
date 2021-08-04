import java.util.Scanner;

public class DayInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào tháng:");
        int month = sc.nextInt();

        if (month > 0 && month < 13) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Tháng " + month + " có 31 ngày");
                    break;
                case 2:
                    System.out.println("Tháng hai có 28 hoặc 29 ngày");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Tháng " + month + "có 30 ngày");
            }
        } else {
            System.out.println("Giá trị nhập vào không hợp lệ");
        }
    }
}
