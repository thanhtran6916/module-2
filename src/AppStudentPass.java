import java.util.Scanner;

public class AppStudentPass {
    public static void main(String[] args) {
        System.out.println("App count the number of students pass");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student number");
        int number = scanner.nextInt();
        float[] arrStudentPoint = inputStudentPoint(number);
        int result = isStudentPass(arrStudentPoint);
        System.out.println("The number of students who passed is " + result);
    }

    public static float[] inputStudentPoint(int number) {
        float[] arrStudentPoint = new float[number];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < number; i++) {
            System.out.println("Enter Student Point " + (i + 1));
            arrStudentPoint[i] = scanner.nextFloat();
        }
        return arrStudentPoint;
    }

    public static int isStudentPass(float[] arr) {
        int total = 0;
        for (float value : arr) {
            if (value >= 5){
                total++;
            }
        }
        return total;
    }
}
