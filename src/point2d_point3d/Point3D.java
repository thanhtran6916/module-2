package point2d_point3d;

import javax.security.auth.login.CredentialException;

public class Point3D extends Point2D {
    private float z;
    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public float[] getXYZ() {
        float[] arr = {this.getX(), this.getY(), this.getZ()};
        return arr;
    }

    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + getZ() + ")";
    }
}
