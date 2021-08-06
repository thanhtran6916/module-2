public class MinValue {

    public static void main(String[] args) {
        int[] arrNumber = {1,3,5,6,7,8,5,33};
        int minArrNumber = isMinValueOfArr(arrNumber);
        System.out.println(minArrNumber + " is small value");
    }

    public static int isMinValueOfArr(int[] arr) {
        int min = arr[0];
        for (int value : arr) {
            if (min > value) {
                min = value;
            }
        }
        return min;
    }
}
