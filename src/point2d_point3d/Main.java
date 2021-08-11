package point2d_point3d;

public class Main {

    public static void main(String[] args) {
        Point2D xy = new Point2D(2,3);
        System.out.println(xy);

        Point3D xyz = new Point3D(2, 3, 4);
        System.out.println(xyz.getXY()[1]);
        xyz.setXYZ(4,5,6);
        System.out.println(xyz);


    }

}
