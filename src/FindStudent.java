import java.util.Scanner;

public class FindStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student you wand to find?");
        String studentFind = sc.nextLine();

        int index = searchIndexStudent(studentFind);// lấy ra giá trị index của mảng
        if (index == -1) {
            System.out.println("No student found!");
        } else {
            System.out.println("Student in position number: " + (index + 1));
        }
    }

    public static int searchIndexStudent(String nameStudent) {
        String[] arr = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println(nameStudent);
        int result = -1;
        int arrLength = arr.length;
        for (int i = 0; i < arrLength; i++) {
            if (nameStudent.equals(arr[i])) {
                result = i;
                break;
            }
        }
        return result;
    }
}
