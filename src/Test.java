import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Nhập vào giá trị");
        Scanner sc = new Scanner(System.in);
        String result = sc.nextLine();
        switch (result) {
            case "A":
                System.out.println("Loại A");
                break;
            case "B":
                System.out.println("Loại B");
                break;
            case "C":
                System.out.println("Loại C");
                break;
            case "D":
                System.out.println("Loại D");
                break;
            default:
                System.out.println("Loại E");
        }
        System.out.println(result == "A");
    }
}