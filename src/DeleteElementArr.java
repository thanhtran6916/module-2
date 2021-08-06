import java.util.Scanner;

public class DeleteElementArr {
    public static void main(String[] args) {
        int[] numberArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        displayNumberArray(numberArray);

        System.out.println("Nhập vào giá trị muốn xóa");
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();

        int index = isInsideArr(numberArray, inputNumber);

        if (index == -1) {
            System.out.println("Mảng không có giá trị " + inputNumber);
        } else {
            int[] newNumberArray = deleteArr(numberArray, index);
            displayNumberArray(newNumberArray);
        }
    }

    public static void displayNumberArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println("");
    }

    public static int isInsideArr(int[] arr, int element) {
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                result = i;
            }
        }
        return result;
    }

    public static int[] deleteArr(int[] arr, int elementIndex) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < elementIndex) {
                newArr[i] = arr[i];
            } else {
                newArr[i] = arr[i + 1];
            }
        }
        return newArr;
    }
}
