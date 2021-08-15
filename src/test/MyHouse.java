package test;

public class MyHouse extends House implements Comparable<MyHouse>{
    private int newArea = 4;

    public MyHouse() {

    }

    public MyHouse(int newArea) {
        this.newArea = newArea;
    }

    @Override
    public int getArea() {
        return newArea * newArea;
    }

    public int getChuVi() {
        return newArea + newArea;
    }


    @Override
    public int compareTo(MyHouse o) {
        if (newArea > o.newArea) {
            return 1;
        }
        return -1;
    }
}
