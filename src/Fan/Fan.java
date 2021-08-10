package Fan;
public class Fan {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
    private int speed = medium;
    private boolean onOff = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public int getSlow() {
        return this.slow;
    }

    public boolean getOnOff() {
        return this.onOff;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    int setSlow(int number) {
        this.speed = number;
        return this.speed;
    }

    public boolean setOnOff(boolean status) {
        this.onOff = status;
        return this.onOff;
    }

    public double setRadius(double number) {
        this.radius = number;
        return this.radius;
    }

    public String setColor(String color) {
        this.color = color;
        return this.color;
    }

    @Override
    public String toString() {
        String result = "";
        if (this.onOff) {
            result += "speed: " + this.speed + "\n"
                    + "color: " + this.color + "\n"
                    + "radius: " + this.radius + "\n"
                    + "fan is on!";
        } else {
            result += "color: " + this.color + "\n"
                    + "radius: " + this.radius + "\n"
                    + "fan is off!";
        }
        return result;
    }

}
