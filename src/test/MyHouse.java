package test;

public class MyHouse extends House {
    private int newArea = 4;


    public MyHouse() {

    }
    public MyHouse(String color) {
        super(color);
    }

    @Override
    public int getArea() {
        return super.getArea();
    }


    public static void main(String[] args) {
        House a = new MyHouse();
        System.out.println(a.getArea());
    }

}
