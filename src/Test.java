import java.util.Arrays;
import java.util.Scanner;
import java.util.Spliterator;
public class Test {
    int a = 4;
    public static void main(String[] args) {
        String[] x = new String[10];
        System.out.println(x[0]);
//        A myObj = new A();
//        System.out.println(myObj.bonus);
        Test myObj = new Test();

        myObj.a();

    }
    public void a() {
        System.out.println("tĩnh cộng động");
    }
}

class Second {
    int b = 5;
    int c = 6;
    public static void main(String[] args) {
        Second second = new Second();
        System.out.println(second.b);
    }
}

class A extends Second {
    int bonus = 7;
}

//        String[] arr = {"Thanh", "Tran", "Van", "A", "C"};
//        String myString = Arrays.toString(arr);
//        System.out.println(myString);
//
//        char[] ch = myString.toCharArray();
//        for (char value : ch) {
//            System.out.println(value);
//        }
//public static int sum(int[] a, int start, int end) {
//    if (start < end) {
//        return sum(a, start + 1, end);
//    } else {
//        return 0;
//    }
//}
// 10 + sum(9) + sum(8) + sum(7) + sum(6) + sum(5) + sum(4) + sum(3) + sum(2) + sum(1) {1 + 0} + sum(0)


//        Scanner sc = new Scanner(System.in);
//        int sum = 0;
//        int i = 0;
//        int number;
//        do {
//            System.out.println("Nhap so");
//            number = sc.nextInt();
//            sum += number;
//        } while (number != 0);
//        System.out.println(sum);



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
//    }
//}