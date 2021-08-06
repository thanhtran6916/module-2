import java.util.Scanner;

public class CountOfChar {
    public static void main(String[] args) {
        System.out.println("Find the number of occurrences of a character in a string");
        String inputString = inputString();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");
        char charSearch = scanner.next().charAt(0);

        int result = countOfChar(inputString, charSearch);
        System.out.println(charSearch + " appeared " + result + " times ");
    }

    public static String inputString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = scanner.nextLine();
        return string;
    }

    public static int countOfChar(String string, char search) {
        int count = 0;
        int stringLength = string.length();
        for (int i = 0; i < stringLength; i++) {
            if (string.charAt(i) == search) {
                count++;
            }
        }
        return count;
    }
}
