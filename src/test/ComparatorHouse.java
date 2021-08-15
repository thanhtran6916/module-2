package test;

import java.util.Comparator;

public class ComparatorHouse implements Comparator<MyHouse> {
    @Override
    public int compare(MyHouse o1, MyHouse o2) {
        if (o1.getArea() > o2.getArea()) {
            return 1;
        }
        return -1;
    }
}
