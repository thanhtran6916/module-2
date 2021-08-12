package circle3;

import java.util.Comparator;

public class ComparatorCircle implements Comparator<Circle> {
    @Override
    public int compare(Circle o1, Circle o2) {
        return o1.getColor().compareTo(o2.getColor());
    }
}
