public class ConcatArr {
    public static void main(String[] args) {
        String[] arr1 = {"calculator_app", "b", "c"};
        String[] arr2 = {"d", "e", "f", "g"};

        String[] arr3 = mergeArray(arr1, arr2);
        for (String value : arr3) {
            System.out.print(value + " ");
        }
    }
    public static String[] mergeArray(String[] arr1, String[] arr2) {
        String[] arrTotal = new String[arr1.length + arr2.length];
        int index = 0;
        for (String value : arr1) {
            arrTotal[index] = value;
            index++;
        }
        for (String value: arr2) {
            arrTotal[index] = value;
            index++;
        }
        return arrTotal;
    }
}
