import java.util.Scanner;

public class MaximumValue {
    public static void main(String[] args) {
        int[] inputNumber = inputArrNumber();
        int max = maxInArrNumber(inputNumber);
        int index = indexInArrNumber(inputNumber, max);
        System.out.println("Max = " + max + " in position = " + index);
    }

    public static int[] inputArrNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of value");
        int number = sc.nextInt();
        int[] inputNumber = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Enter Number " + (i + 1));
            inputNumber[i] = sc.nextInt();
        }
        return inputNumber;
    }

    public static int maxInArrNumber(int[] arrNumber) {
        int max = arrNumber[0];
        for (int value : arrNumber) {
            if (max < value) {
                max = value;
            }
        }
        return max;
    }

    public static int indexInArrNumber(int[] arrNumber, int value) {
        int index = -1;
        int arrNumberLength = arrNumber.length - 1;
        for (int i = 0; i < arrNumberLength; i++) {
            if (arrNumber[i] == value) {
                index = i + 1;
                break;
            }
        }
        return index;
    }
}
