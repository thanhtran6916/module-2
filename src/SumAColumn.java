import java.beans.PropertyEditorSupport;

public class SumAColumn {
    public static void main(String[] args) {
        float[][] arrNumber = {
                {1,2,3,4,4,5},
                {2,3,4,5,6},
                {7,8,9,7,5}
        };
        float result = calculateSumAColumn(arrNumber, 5);
        System.out.println(result);
    }

    public static float calculateSumAColumn(float[][] arr, int col) {
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == col) {
                    sum += arr[i][j];
                    break;
                }
            }
        }
        return sum;
    }

}
