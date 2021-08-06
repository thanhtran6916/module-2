import java.util.Scanner;

public class SumOfMainDiagonal {
    public static void main(String[] args) {
        System.out.println("APP MAIN DIAGONAL CALCULATION");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the matrix number");
        int number = scanner.nextInt();

        float[][] arrNumber = arrInput(number);
        displayArr(arrNumber);

        float sum = calculateOfSumMainDiagonal(arrNumber);
        System.out.println(sum);
    }

    public static void displayArr(float[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static float[][] arrInput(int number) {
        float[][] arrInput = new float[number][number];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.println("Enter position " + i + " " + j);
                arrInput[i][j] = scanner.nextFloat();
            }
        }
        return arrInput;
    }

    public static float calculateOfSumMainDiagonal(float[][] arr) {
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        return sum;
    }
}
