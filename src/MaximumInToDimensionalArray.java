import java.util.Scanner;

public class MaximumInToDimensionalArray {
    public static void main(String[] args) {
        int[][] numberMatrixArray = createToArrayDimension(inputMatrix());
        int[] result = maxDimensionalArray(numberMatrixArray);

        System.out.println("Max: " + result[0] + " position " + result[1] + " and " + result[2]);
    }

    public static String[] inputMatrix() {
        System.out.println("Find the maximum value in a matrix");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the matrix size");
        int matrixSize = sc.nextInt();

        String[] inputStringMatrix = new String[matrixSize];
        sc.nextLine();

        for (int i = 0; i < matrixSize; i++) {
            System.out.println("Enter line " + i + " !Use \",\" to separate");
            inputStringMatrix[i] = sc.nextLine();
        }
        for (String value : inputStringMatrix) {
            System.out.println(value);
        }
        return inputStringMatrix;
    }

    public static int[][] createToArrayDimension(String[] arr) {
        int[][] numberArr = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            int index = 0;
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == ',' ) {
                    continue;
                } else {
                    numberArr[i][index] = Integer.parseInt(String.valueOf(arr[i].charAt(j)));
                    index++;
                }
            }
        }
        return numberArr;
    }

    public static int[] maxDimensionalArray(int[][] arr) {
        int[] result = new int[3];
        result[0] = arr[0][0];
        result[1] = 0;
        result[2] = 0;
        int arrLength = arr.length;
        for (int i = 0; i < arrLength; i++) {
            for (int j = 0; j < arrLength; j++) {
                if (result[0] < arr[i][j]) {
                    result[0] = arr[i][j];
                    result[1] = i;
                    result[2] = j;
                }
            }
        }
        return result;
    }
}
