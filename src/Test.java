import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int i = 0;
        int number;
        do {
            System.out.println("Nhap so");
            number = sc.nextInt();
            sum += number;
        } while (number != 0);
        System.out.println(sum);



//        int[] array = {1,2,3,4,5,6};
//        System.out.println(array.length);
//        double a = 3.3333;
//        System.out.println(Math.floor(a));
//        System.out.println("Nhập vào giá trị");
//        Scanner sc = new Scanner(System.in);
////        char result = sc.next().charAt(0);
//        String result = sc.nextLine();
//        System.out.println(result.equals("A"));
//        switch (result) {
//                case "A":
//                    System.out.println("Loại A");
//                    break;
//                case "B":
//                    System.out.println("Loại B");
//                    break;
//                case "C":
//                    System.out.println("Loại C");
//                    break;
//                case "D":
//                    System.out.println("Loại D");
//                    break;
//                default:
//                    System.out.println("Loại E");
//        }
    }
}