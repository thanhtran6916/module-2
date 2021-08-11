
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        System.out.println("Nhập vào số phần tử của mảng");
        Scanner sc = new Scanner(System.in);
        int arrLength = sc.nextInt();
        if (arrLength <= 0) {
            System.out.println("Exit");
            return;
        }
        String[] nameStudentArray = createArray(arrLength);
        displayArr(nameStudentArray);
//Nhập vào tên muốn thêm
        sc.nextLine();
        System.out.println("Nhập vào tên muốn thêm");
        String addName = sc.nextLine();
//Nhập vào vị trí muốn thêm
        System.out.println("Nhập vào vị trí muốn thêm");
        int indexAdd = sc.nextInt() - 1;
//Gọi phương thức add tên và hiển thị ra màn hình
        String[] newNameStudentArray = addElementToArray(nameStudentArray, addName, indexAdd);
        displayArr(newNameStudentArray);
    }
    public static void displayArr(String[] arr) {
        for (String value : arr) {
            System.out.print(value + " ");
        }
        System.out.println(" ");
    }

    public static String[] createArray(int arrLength) {
        String[] arr = new String[arrLength];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Tên thứ " + (i + 1));
            String element = sc.nextLine();
            arr[i] = element;
        }

        return arr;
    }

    public static String[] addElementToArray(String[] arr, String element, int index) {
        String[] newArr = new String[arr.length + 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            } else if (i == index) {
                newArr[i] = element;
            } else {
                newArr[i] = arr[i - 1];
            }
        }
        return newArr;
    }
}
