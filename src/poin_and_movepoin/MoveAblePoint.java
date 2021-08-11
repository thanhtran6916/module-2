package poin_and_movepoin;

public class MoveAblePoint extends Point{
    private float xSpeed;
    private float ySpeed;

    public MoveAblePoint() {}

    public MoveAblePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveAblePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] arr = {this.xSpeed, this.ySpeed};
        return arr;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return super.toString() + ", speed = " + "(" + this.xSpeed + "," + this.ySpeed + ")";
    }

    public MoveAblePoint move() {
        MoveAblePoint newPoint = new MoveAblePoint(super.getX(), super.getY(), this.xSpeed, this.ySpeed);
        newPoint.setX(super.getX() + this.xSpeed);
        newPoint.setY(super.getY() + this.ySpeed);
        return newPoint;
    }
}
