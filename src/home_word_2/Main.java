package home_word_2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("PHẦN MỀM QUẢN LÝ KHÁCH SẠN");
        Hotel myHotel = new Hotel();
        Scanner scanner = new Scanner(System.in);
        int choose = -1;
        do {
            displayMenu();
            System.out.println("Nhập giá trị từ 0 --> 6");
            choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1:
                    System.out.print("Nhập tên ");
                    String nameCustomer = scanner.nextLine();
                    System.out.print("Nhập tuổi ");
                    int ageCustomer = scanner.nextInt();
                    System.out.print("Nhập ID ");
                    int idCustomer = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Loại phòng ");
                    String typeRoom = scanner.nextLine();
                    System.out.print("Check in ");
                    int checkIn = scanner.nextInt();
                    System.out.println();
                    Customer customer = new Customer(idCustomer, nameCustomer, ageCustomer, typeRoom, checkIn);
                    Customer[] newArrCustomer = new Customer[myHotel.getArrCustomer().length + 1];
                    if (myHotel.getArrCustomer().length == 0) {
                        newArrCustomer[newArrCustomer.length - 1] = customer;
                    } else {
                        System.arraycopy(myHotel.getArrCustomer(), 0, newArrCustomer, 0, myHotel.getArrCustomer().length);
                        newArrCustomer[newArrCustomer.length - 1] = customer;
                    }
                    myHotel.setArrCustomer(newArrCustomer);
                    break;
                case 2:
                    System.out.println("Nhập id của khách hàng muốn trả phòng");
                    int search1 = scanner.nextInt();
                    if (isCustomer(myHotel.getArrCustomer(), search1)) {
                        System.out.println("Nhập ngày trả phòng");
                        int dateCheckOut = scanner.nextInt();
                        int dateCheckIn = dateCheckInOfCustomer(myHotel.getArrCustomer(), search1);
                        String typeRoomCustomer = typeRoomCustomer(myHotel.getArrCustomer(), search1);
                        if (typeRoomCustomer.equals(myHotel.getTypeRoom()[0])) {
                            System.out.println("Tổng " + (dateCheckOut - dateCheckIn) * myHotel.getRateMoney()[0] + " VND");
                        } else {
                            System.out.println("Tổng " + (dateCheckOut - dateCheckIn) * myHotel.getRateMoney()[1] + " VND");
                        }
                        myHotel.setArrCustomer(deleteArrCustomer(myHotel.getArrCustomer(), search1));
                    } else {
                        System.out.println("Không tìm thấy ID của khách hàng trong hệ thống");
                    }

                    break;
                case  3:
                    displayArrCustomer(myHotel.getArrCustomer());
                    break;
                case 4:
                    System.out.println("Nhập id của khách hàng muốn tìm kiếm");
                    int search4 = scanner.nextInt();
                    if (isCustomer(myHotel.getArrCustomer(), search4)) {
                        System.out.println(searchCustomer(myHotel.getArrCustomer(), search4));
                    } else {
                        System.out.println("Không tìm thấy ID của khách hàng trong hệ thống");
                    }
                    break;
                case 5:
                    myHotel.setArrCustomer(sortArrCustomer(myHotel.getArrCustomer()));
                    displayArrCustomer(myHotel.getArrCustomer());
                    break;
                case 6:
                    System.out.println("Nhập ID khách hàng muốn sửa tên");
                    int search6 = scanner.nextInt();
                    if (isCustomer(myHotel.getArrCustomer(), search6)) {
                        System.out.println("");
                        int subChoose = -1;
                        do {
                            displaySubMenu();
                            System.out.println("Nhập giá trị từ 0 --> 6");
                            subChoose = scanner.nextInt();
                            scanner.nextLine();
                            switch (subChoose) {
                                case 1:
                                    System.out.println("Nhập tên");
                                    String editNameCustomer = scanner.nextLine();
                                    myHotel.setArrCustomer(editNameCustomer(myHotel.getArrCustomer(), search6, editNameCustomer));
                                    break;
                                case 2:
                                    System.out.println("Nhập tuổi");
                                    int editAgeCustomer = scanner.nextInt();
                                    scanner.nextLine();
                                    myHotel.setArrCustomer(editAgeCustomer(myHotel.getArrCustomer(), search6, editAgeCustomer));
                                    break;
                                case 3:
                                    System.out.println("Nhập ID");
                                    int editIdCustomer = scanner.nextInt();
                                    scanner.nextLine();
                                    myHotel.setArrCustomer(editIdCustomer(myHotel.getArrCustomer(), search6, editIdCustomer));
                                    break;
                                case 4:
                                    System.out.println("Nhập loại phòng");
                                    String editTypeRoomCustomer = scanner.nextLine();
                                    myHotel.setArrCustomer(editTypeRoomCustomer(myHotel.getArrCustomer(), search6, editTypeRoomCustomer));
                                    break;
                                case 5:
                                    System.out.println("Nhập ngày check in");
                                    int editCheckInCustomer = scanner.nextInt();
                                    myHotel.setArrCustomer(editCheckInCustomer(myHotel.getArrCustomer(), search6, editCheckInCustomer));
                                    break;
                            }

                        } while (subChoose != 0);
                    } else {
                        System.out.println("Không tìm thấy ID của khách hàng trong hệ thống");
                    }
                    break;
                case 0:
                    break;
            }


        } while (choose != 0);

    }

    public static void displayMenu() {
        System.out.println("Menu");
        System.out.println("1. Khách vào");
        System.out.println("2. Khách ra và thanh toán");
        System.out.println("3. Hiển thị toàn bộ khách hàng");
        System.out.println("4. Tìm kiến khách hàng");
        System.out.println("5. Sắp xếp khách hàng theo thứ tự từ a - z");
        System.out.println("6. Sửa thông tin khách hàng");
        System.out.println("0. Thoát khỏi hệ thống");
    }

    public static void displaySubMenu() {
        System.out.println("Thông tin cần phải chỉnh sửa");
        System.out.println("1. Tên");
        System.out.println("2. Tuổi");
        System.out.println("3. ID");
        System.out.println("4. Loại phòng");
        System.out.println("5. Ngày check in");
        System.out.println("0. Thoát");
    }

    public static Customer[] editNameCustomer(Customer[] arrCustomer, int id, String name) {
        for (int i = 0; i < arrCustomer.length; i++) {
            if (arrCustomer[i].getId() == id) {
                arrCustomer[i].setFullName(name);
                break;
            }
        }
        return arrCustomer;
    }

    public static Customer[] editAgeCustomer(Customer[] arrCustomer, int id, int age) {
        for (int i = 0; i < arrCustomer.length; i++) {
            if (arrCustomer[i].getId() == id) {
                arrCustomer[i].setAge(age);
                break;
            }
        }
        return arrCustomer;
    }

    public static Customer[] editIdCustomer(Customer[] arrCustomer, int id, int newId) {
        for (int i = 0; i < arrCustomer.length; i++) {
            if (arrCustomer[i].getId() == id) {
                arrCustomer[i].setId(newId);
                break;
            }
        }
        return arrCustomer;
    }

    public static Customer[] editTypeRoomCustomer(Customer[] arrCustomer, int id, String typeRoom) {
        for (int i = 0; i < arrCustomer.length; i++) {
            if (arrCustomer[i].getId() == id) {
                arrCustomer[i].setTypeRoom(typeRoom);
                break;
            }
        }
        return arrCustomer;
    }

    public static Customer[] editCheckInCustomer(Customer[] arrCustomer, int id, int checkIn) {
        for (int i = 0; i < arrCustomer.length; i++) {
            if (arrCustomer[i].getId() == id) {
                arrCustomer[i].setCheckIn(checkIn);
                break;
            }
        }
        return arrCustomer;
    }

    public static void displayArrCustomer(Customer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " " + arr[i].toString());
        }
    }

    public static boolean isCustomer(Customer[] arrCustomer, int id) {
        boolean result = false;
        for (int i = 0; i < arrCustomer.length; i++) {
            if (arrCustomer[i].getId() == id) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static String searchCustomer(Customer[] arrCustomer, int id) {
        String result = "";
        for (int i = 0; i < arrCustomer.length; i++) {
            if (arrCustomer[i].getId() == id) {
                result = arrCustomer[i].toString();
                break;
            }
        }
        return result;
    }

    public static int dateCheckInOfCustomer(Customer[] arrCustomer, int id) {
        int result = 0;
        for (int i = 0; i < arrCustomer.length; i++) {
            if (arrCustomer[i].getId() == id) {
                result = arrCustomer[i].getCheckIn();
                break;
            }
        }
        return result;
    }

    public static String typeRoomCustomer(Customer[] arrCustomer, int id) {
        String result = "";
        for (int i = 0; i < arrCustomer.length; i++) {
            if (arrCustomer[i].getId() == id) {
                result = arrCustomer[i].getTypeRoom();
                break;
            }
        }
        return result;
    }

    public static Customer[] deleteArrCustomer(Customer[] arrCustomer, int id) {
        Customer[] newArrCustomer = new Customer[arrCustomer.length - 1];
        int index = 0;
        for (int i = 0; i < arrCustomer.length; i++) {
            if (arrCustomer[i].getId() == id) {
                continue;
            }
            newArrCustomer[index] = arrCustomer[i];
            index++;
        }
        return newArrCustomer;
    }

    public static Customer[] sortArrCustomer(Customer[] arrCustomer) {
        for (int i = 0; i < arrCustomer.length; i++) {
            for (int j = 0; j < arrCustomer.length; j++) {
                if (arrCustomer[i].getFullName().compareTo(arrCustomer[j].getFullName()) < 0) {
                    Customer temp = arrCustomer[i];
                    arrCustomer[i] = arrCustomer[j];
                    arrCustomer[j] = temp;
                }
            }
        }
        return arrCustomer;
    }
}