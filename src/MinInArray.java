import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {
        System.out.println("Enter the number of element");
        Scanner scanner = new Scanner(System.in);
        int numberElement = scanner.nextInt();
        int[] numberArray = inputArr(numberElement);
        int result = minArray(numberArray);
        System.out.println("Min is " + result);
    }

    public static int[] inputArr(int number) {
        int[] arr = new int[number];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < number; i++) {
            System.out.println("Enter the number " + i);
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
    public static int minArray(int[] arr) {
        int min = arr[0];
        for (int value : arr) {
            if (min > value) {
                min = value;
            }
        }
        return min;
    }
}
