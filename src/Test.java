public class Test {
    String name;
    int age;

    public static void main(String[] args) {
//        A myObj = new A();
//        System.out.println(myObj.bonus);
        String str = "Welcome to gpcoder.com";
        byte[] b = str.getBytes();
        char c = 87;
        System.out.println(c);
        for (byte value : b) {
            System.out.println(value);
        }
        Test myObj = new Test();
        String y = "22 11 33.3 44 55 66";
        int count = 0;
        for (int i = 0; i < y.length(); i++) {
            if (y.charAt(i) == ' ') {
                count++;
            }
        }
        String[] x = new String[count += 1];
        for (int i = 0; i < x.length; i++) {
            x[i] = "";
        }
        int index = 0;
        for (int i = 0; i < y.length(); i++) {
            if (y.charAt(i) != ' ') {
                x[index] += y.charAt(i);
            } else {
                index++;
                continue;
            }
        }
        for (String value : x) {
            System.out.println(value);
        }



//        String[] x = " ".split(y);
        float[] a = new float[x.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = Float.parseFloat(x[i]);
        }

        float sum = 0;
        for (float value : a) {
            sum += value;
        }
        System.out.println(sum);
        Second g = new Second(2,3);
        g.getRadius();
        Second.getRadius();
        g.active("", 2);
        g.active("",3);
        Second.active("", 4);


    }

}


class Second {
    int width, height;
    Second(int width, int height) {
        this.width = width;
        this.height = height;
    }

    static void active(String a, int b) {
        System.out.println(2);
    }
    static double getRadius() {
        return 0;
    }


}

class Rectanglea {
    double width, height;

    public Rectanglea() {
    }

    public Rectanglea(double width, double height) {
        this.width = width;
        this.height = height;
    }
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