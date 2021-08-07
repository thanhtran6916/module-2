package HomeWork1;

import java.util.Arrays;

public class HomeWork {                        //Thử sử dụng cú pháp của mảng nhưng không biết nên dùng this.arr trong
    String[] arr;                              // phương thức hay truyền vào một mảng được tạo ở ngoài!!!

    public HomeWork(String[] arr) {
        this.arr = arr;
    }

    public void displayArr() {
        for (String value : this.arr) {
            System.out.println(value + " ");
        }
    }

    public String[] addElement(String element) {
        String[] newArr = new String[this.arr.length];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        newArr[newArr.length - 1] = element;
        return newArr;
    }

    public boolean ofArr(String element) {  //Check if element is in array
        boolean check = false;
        for (String value : this.arr) {
            if (element.equals(value)) {
                check = true;
                break;
            }
        }
        return check;
    }

    public String[] deleteArr(String element) {
        String[] newArr = new String[this.arr.length - 1];
        int index = 0;
        for (String value : this.arr) {
            if (element.equals(value)) {
                continue;
            }
            newArr[index] = value;
            index++;
        }
        return newArr;
    }

    public String searchElement(int index) { //Search buy index
        String element = null;
        for (int i = 0; i < this.arr.length; i++) {
            if (i == index) {
                element = this.arr[i];
                break;
            }
        }
        return element;
    }

    public int searchElement(String element) { //Search buy element first
        int index = -1;
        for (int i = 0; i < this.arr.length; i++) {
            if (element.equals(this.arr[i])) {
                index = i;
                break;
            }
        }
        return index;
    }

    public String[] sort() {
        Arrays.sort(this.arr);
        return this.arr;
    }
}
