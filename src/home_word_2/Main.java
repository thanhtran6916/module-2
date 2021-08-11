package home_word_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hotel management software");
        Hotel myHotel = new Hotel();
        Customer one = inputCustomer();
        myHotel.addCustomer(one);

        myHotel.displayCustomerAll();

        int result = myHotel.calculateMoney(inputCustomer());
        System.out.println(result);

    }

    public static Customer inputCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer");

        System.out.println("ID");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Full name");
        String fullName = scanner.nextLine();

        System.out.println("Age");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Type room");
        String typeRoom = scanner.nextLine();

        System.out.println("Check in");
        int checkIn = scanner.nextInt();

        System.out.println("Check out");
        int checkOut = scanner.nextInt();
        Customer a = new Customer(id, fullName, age, typeRoom, checkIn, checkOut);
        return a;
    }
}
