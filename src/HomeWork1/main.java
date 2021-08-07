package HomeWork1;

public class main {
    public static void main(String[] args) {
        System.out.println("Home Word");
        String[] arr = {"iphone", "samsung", "lg", "nokia", "oppo"};
        displayProduct(arr);

        String[] newArrAdd = addProduct(arr, "xiaomi");
        displayProduct(newArrAdd);

        String deleteProduct = "iphone";
        if (isProduct(newArrAdd, deleteProduct)) {
            System.out.println("Deleted " + deleteProduct);
            String[] newArrDelete = deleteProduct(newArrAdd, deleteProduct);
            displayProduct(newArrDelete);
        } else {
            System.out.println(deleteProduct + " not in the Array");
        }
    }

    public static void displayProduct(String[] arr) {
        for (String value : arr) {
            System.out.print(value + " ");
        }
        System.out.println("");
    }

    public static String[] addProduct(String[] arr, String product) {
        String[] newArr = new String[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length - 1] = product;
        return newArr;
    }

    public static boolean isProduct(String[] arr, String product) {
        boolean result = false;
        for (String value : arr) {
            if (product.equals(value)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static String[] deleteProduct(String[] arr, String product) {
        String[] newArr = new String[arr.length - 1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (product.equals(arr[i])) {
                continue;
            }
            newArr[index] = arr[i];
            index++;
        }
        return newArr;
    }

    public static int searchNumberProduct(String[] arr, String product) {  //Tìm số phần tử có trong mảng
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (String value : arr) {
                if (product.equals(value)) {
                    index++;
                }
            }
        }
        return index;
    }

    public static int searchProductFirst(String[] arr, String product) { //Tìm vị trí phần tử đầu tiên trong mảng
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (product.equals(arr[i])) {
                index = i;
                 break;
            }
        }
        return index;
    }

    public static int searchProductPosition(String[] arr, String product, int index) { //Tìm vị trí phần tử ở vị trí được chỉ định
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            if (product.equals(arr[i]) && index == i) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static String[] sortArr(String[] arr) { //Sắp xếp phần tử theo thứ tự giảm dần của bảng chữ cái "Không dùng sort()" dùng cho 1 ký tự thôi
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                int ascii = arr[j].charAt(0);
                int ascii1 = arr[j + 1].charAt(0);
                if (ascii > ascii1) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}


