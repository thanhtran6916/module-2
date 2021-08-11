package circle;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(2);
        System.out.println(cylinder.getVolume());

        cylinder = new Cylinder(2, 2, "blue");
        System.out.println(cylinder);
    }
}
