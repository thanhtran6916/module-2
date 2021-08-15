package test;

public class YourHouse extends House{
    private int newArea = 4;


    @Override
    public int getArea() {
        return 2 * newArea * newArea;
    }

    public int getChuVi() {
        return 2 * 2 * newArea;
    }
}
