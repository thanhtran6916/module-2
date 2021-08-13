package home_work_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("PHẦN MỀM QUẢN LÝ HÓA ĐƠN TIỀN ĐIỆN");
        Scanner scanner = new Scanner(System.in);
        ElectricBill[] electricBillsArr = new ElectricBill[0];

        int choose = -1;
        do {
            displayMenu();
            choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1:
                    System.out.println("Nhập số lượng hộ gia đình");
                    int number = scanner.nextInt();
                    scanner.nextLine();
                    electricBillsArr = new ElectricBill[number];
                    for (int i = 0; i < electricBillsArr.length; i++) {
                        Customer customer = inputCustomer(scanner);
                        electricBillsArr[i] = inputElectricBill(scanner, customer);
                    }
                    break;
                case 2:
                    if (electricBillsArr.length == 0) {
                        System.out.println("Không có khách hàng nào trong bộ nhớ");
                        System.out.println();
                    } else {
                        for (ElectricBill electricBill : electricBillsArr) {
                            System.out.println(electricBill.toString());
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Nhập mã số công tơ của hộ dân");
                    String electricMeterCode = scanner.nextLine();
                    int index = indexElectricBillArr(electricBillsArr, electricMeterCode);
                    if (index >= 0) {
                        double payMoney = electricBillsArr[index].getPayMoney();
                        System.out.println("Tổng số tiển = " + payMoney);
                    } else {
                        System.out.println("Không tìm thấy khách hàng");
                    }
                    break;
            }
        } while (choose != 0);


    }


    public static int indexElectricBillArr(ElectricBill[] electricBillArr, String electricMeterCode) {
        int result = -1;
        for (int i = 0; i < electricBillArr.length; i++) {
            if (electricMeterCode.equals(electricBillArr[i].getCustomer().getElectricMeterCode())) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static Customer inputCustomer(Scanner scanner) {
        System.out.println("Nhập tên chủ hộ");
        String name = scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("Nhập mã số công tơ");
        String electricMeterCode = scanner.nextLine();
        Customer customer = new Customer(name, address, electricMeterCode);
        return customer;
    }

    public static ElectricBill inputElectricBill(Scanner scanner, Customer customer) {
        System.out.println("Nhập chỉ số công tơ cũ");
        int oldIndexElectric = scanner.nextInt();
        System.out.println("Nhập chỉ số công tơ mới");
        int newIndexElectric = scanner.nextInt();
        ElectricBill electricBill = new ElectricBill(customer, oldIndexElectric, newIndexElectric);
        return electricBill;
    }

    public static void displayMenu() {
        System.out.println("Chọn các tùy chọn sau");
        System.out.println("1. Nhập thông tin cho n hộ sử dụng điện");
        System.out.println("2. Hiển thị thông tin các biên lai đã nhập");
        System.out.println("3. Tính tiền điện phải trả cho mỗi hộ dân");
        System.out.println("0. Thoát");
    }
}
