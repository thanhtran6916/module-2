package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class main {

    public static void main(String[] args) {
        House[] houseArr = new House[3];
        houseArr[0] = new MyHouse();
        houseArr[1] = new YourHouse();
        houseArr[2] = new MyHouse();

        for (House value : houseArr) {
            if (value instanceof MyHouse) {
                System.out.println(((MyHouse) value).getChuVi());
            } else if (value instanceof YourHouse) {
                System.out.println(((YourHouse) value).getChuVi());
            }
        }


        System.out.println("");

        MyHouse[] myHouses = new MyHouse[4];
        myHouses[0] = new MyHouse(3);
        myHouses[1] = new MyHouse(10);
        myHouses[2] = new MyHouse(8);
        myHouses[3] = new MyHouse(7);

        for (MyHouse value : myHouses) {
            System.out.println(value.getArea());
        }

        System.out.println("");

        Arrays.sort(myHouses);

        for (MyHouse value : myHouses) {
            System.out.println(value.getArea());
        }


        System.out.println("");

        MyHouse[] myHouseArr = new MyHouse[4];
        myHouses[0] = new MyHouse(3);
        myHouses[1] = new MyHouse(10);
        myHouses[2] = new MyHouse(8);
        myHouses[3] = new MyHouse(7);

        ArrayList<MyHouse> newArrHouse = new ArrayList<>();
        newArrHouse.add(new MyHouse(3));
        newArrHouse.add(new MyHouse(10));
        newArrHouse.add(new MyHouse(8));
        newArrHouse.add(new MyHouse(7));
        newArrHouse.add(2, new MyHouse(2));

        for (MyHouse value : newArrHouse) {
            System.out.println(value.getArea());
        }

        Collections.sort(newArrHouse, new ComparatorHouse());

        for (MyHouse value : newArrHouse) {
            System.out.println(value.getArea());
        }

        ArrayList<MyHouse> testArrList = new ArrayList<>();
        testArrList.add(new MyHouse(3));
        testArrList.add(new MyHouse(2));
        System.out.println(testArrList.size());

        LinkedList<House> testLinkList = new LinkedList<>();
        testLinkList.add(new MyHouse(4));
        testLinkList.add(new MyHouse(5));
        System.out.println(testLinkList.size());
        test a = new House();
        House b = (House) a;
        System.out.println(b.getArea());
    }
}
