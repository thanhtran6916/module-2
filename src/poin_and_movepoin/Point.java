package poin_and_movepoin;

public class Point {
    private float x;
    private float y;

    public Point() {

    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float Y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] arr = {this.x, this.y};
        return arr;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}



