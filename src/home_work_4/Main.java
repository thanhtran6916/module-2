package home_work_4;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("PHẦN MỀM QUẢN LÝ VẬT LIỆU");
        Scanner scanner = new Scanner(System.in);
        MaterialManager myStore = new MaterialManager();

        int chooseMenu = -1;
        do {
            displayMenu();
            System.out.println("Mời bạn nhập số từ 0 đến 5");
            chooseMenu = scanner.nextInt();
            scanner.nextLine();
            switch (chooseMenu) {
                case 1:
                    int chooseSubMenu = -1;
                    do {
                        subDisplayMenu();
                        System.out.println("Chọn số từ 0 đến 2");
                        chooseSubMenu = scanner.nextInt();
                        scanner.nextLine();
                        switch (chooseSubMenu) {
                            case 1:
                                if (myStore.getMaterials().length == 0) {
                                    myStore.setMaterials(inputMeat(scanner));
                                } else {
                                    myStore.addMaterial(inputMeat(scanner));
                                }
                                break;
                            case 2:
                                if (myStore.getMaterials().length == 0) {
                                    myStore.setMaterials(inputFlout(scanner));
                                } else {
                                    myStore.addMaterial(inputFlout(scanner));
                                }
                                break;
                        }

                    } while (chooseSubMenu != 0);
                    break;
                case 2:
                    break;
                case 3:

                    break;
                case 4:
                    double total = myStore.discount();
                    System.out.println("Tổng số tiền sau khi tính toán là " + total);
                    break;
            }
        } while (chooseMenu != 0);
        displayMaterialArr(myStore);
    }

    public static void displayMenu() {
        System.out.println("1. Nhập vật liệu");
        System.out.println("2. Chỉnh sửa vật liệu");
        System.out.println("3. Nhập xóa vật liệu");
        System.out.println("4. Nhập tính tổng số tiền vật liệu");
        System.out.println("0. Thoát");
    }

    public static void subDisplayMenu() {
        System.out.println("1. Nhập thịt");
        System.out.println("2. Nhập bột");
        System.out.println("0. Thoát");
    }

    public static void displayMaterialArr(MaterialManager myStore) {
        for (Material material : myStore.getMaterials()) {
            System.out.println(material);
        }

    }

    public static Material[] inputMeat(Scanner scanner) {
        System.out.println("Nhập số đối tượng thịt");
        int size = scanner.nextInt();
        scanner.nextLine();
        Material[] meatArr = new Material[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập id thịt");
            String id = scanner.nextLine();
            System.out.println("Nhập tên thịt");
            String name = scanner.nextLine();
            System.out.println("Nhập ngày sản xuất thịt");
            System.out.print("Nhập ngày ");
            int day = scanner.nextInt();
            System.out.print("Nhập tháng ");
            int month = scanner.nextInt();
            System.out.print("Nhập năm ");
            int year = scanner.nextInt();
            System.out.println("Nhập giá tiền");
            int cost = scanner.nextInt();
            System.out.println("Nhập trọng lượng");
            double weight = scanner.nextDouble();
            scanner.nextLine();
            meatArr[i] = new Meat(id, name, LocalDate.of(year, month, day), cost, weight);
        }
        return meatArr;
    }

    public static Material[] inputFlout(Scanner scanner) {
        System.out.println("Nhập số lượng đối tượng bột");
        int size = scanner.nextInt();
        scanner.nextLine();
        Material[] floutArr = new CrispyFlout[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập id bột");
            String id = scanner.nextLine();
            System.out.println("Nhập tên bột");
            String name = scanner.nextLine();
            System.out.println("Nhập ngày sản xuất bột");
            System.out.print("Nhập ngày ");
            int day = scanner.nextInt();
            System.out.print("Nhập tháng ");
            int month = scanner.nextInt();
            System.out.print("Nhập năm ");
            int year = scanner.nextInt();
            System.out.println("Nhập giá thành");
            int cost = scanner.nextInt();
            System.out.println("Nhập trọng lượng");
            int quality = scanner.nextInt();
            scanner.nextLine();
            floutArr[i] = new CrispyFlout(id, name, LocalDate.of(year, month, day), cost, quality);
        }
        return floutArr;
    }
}
