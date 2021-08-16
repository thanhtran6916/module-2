package new2_home_word_3;

import java.time.LocalDate;
import java.util.Scanner;

class MaterialManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng loại thịt");
        int meatSize = scanner.nextInt();
        System.out.println("Nhập số lượng loại bột");
        int crispyFlourSize = scanner.nextInt();
        scanner.nextLine();
        Material[] myMaterial = new Material[meatSize + crispyFlourSize];
        int lengthMyMaterial = myMaterial.length;
        for (int i = 0; i < lengthMyMaterial; i++) {
            if (i < meatSize) {
                System.out.println("Nhập loại thịt thứ " +(i + 1));
                myMaterial[i] = inputMeat(scanner);
            } else {
                System.out.println("Nhập loại bột thứ " + (i + 1 - meatSize));
                myMaterial[i] = inputCrispyFlour(scanner);
            }
        }

        double noDiscountOfDay = getNoDiscountOfDay(myMaterial);
        System.out.println("Không chiết khấu = " + noDiscountOfDay);

        double discountOfDay = getDiscountOfDay(myMaterial);
        System.out.println("Có chiết khấu = " + discountOfDay);

        System.out.println();

        System.out.println("Số chênh lệch = " + (noDiscountOfDay - discountOfDay));
        System.out.println();

        for (Material value : myMaterial) {
            System.out.println(value);
        }
    }

    private static double getDiscountOfDay(Material[] myMaterial) {
        double discountOfDay = 0;
        for (Material value : myMaterial) {
            if (value instanceof Meat) {
                discountOfDay += ((Meat) value).getRealMoney();
            }
            if (value instanceof CrispyFlour){
                discountOfDay += ((CrispyFlour) value).getRealMoney();
            }
        }
        return discountOfDay;
    }

    private static double getNoDiscountOfDay(Material[] myMaterial) {
        double noDiscountOfDay = 0;
        for (Material value : myMaterial) {
            noDiscountOfDay += value.getAmount();
        }
        return noDiscountOfDay;
    }

    public static Material inputMeat(Scanner scanner) {
        System.out.println("Nhập id thịt ");
        String id = scanner.nextLine();
        System.out.println("Nhập tên thịt");
        String name = scanner.nextLine();
        System.out.print("Nhập ngày sản xuất thịt ");
        int day = scanner.nextInt();
        System.out.print("Nhập tháng sản xuất thịt ");
        int month = scanner.nextInt();
        System.out.print("Nhập năm sản xuất thịt ");
        int year = scanner.nextInt();
        System.out.println("Nhập giá thịt");
        int cost = scanner.nextInt();
        System.out.println("Nhập trọng lượng thịt");
        int weight = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        return new Meat(id, name, LocalDate.of(year, month, day), cost, weight);
    }

    public static Material inputCrispyFlour(Scanner scanner) {
        System.out.println("Nhập id bột ");
        String id = scanner.nextLine();
        System.out.println("Nhập tên bột");
        String name = scanner.nextLine();
        System.out.print("Nhập ngày sản xuất bột ");
        int day = scanner.nextInt();
        System.out.print("Nhập tháng sản xuất bột ");
        int month = scanner.nextInt();
        System.out.print("Nhập năm sản xuất bột ");
        int year = scanner.nextInt();
        System.out.println("Nhập giá bột");
        int cost = scanner.nextInt();
        System.out.println("Nhập trọng lượng bột");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        return new CrispyFlour(id, name, LocalDate.of(year, month, day), cost, quantity);
    }

}
