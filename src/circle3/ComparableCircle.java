package circle3;

class ComparableCircle extends Circle implements Comparable<Circle>{
    public ComparableCircle() {

    }

    public ComparableCircle(double radius, String color) {
        super(radius, color);
    }

    @Override
    public int compareTo(Circle o) {
        if (radius > o.radius) {
            return 1;
        } else if (radius == o.radius) {
            return 0;
        } else return -1;
    }
}
