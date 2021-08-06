import java.util.Scanner;

public class InvertElement {
    public static void main(String[] args) {
        outputArray();
    }

    //Nhập vào mảng
    public static int[] inputArray() {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element: ");
            int number = sc.nextInt();
            arr[i] = number;
        }
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println(" ");
        return arr;
    }

    //Đảo ngược mảng
    public static int[] outputArray() {
        int[] inputArray = inputArray();

        int inputArrayLength = inputArray.length - 1;
        for (int i = 0; i < inputArrayLength - i; i++) {
            int temp = inputArray[i];
            inputArray[i] = inputArray[inputArrayLength - i];
            inputArray[inputArrayLength - i] = temp;
        }

        for (int value : inputArray) {
            System.out.print(value + " ");
        }
        return inputArray;
    }
}
