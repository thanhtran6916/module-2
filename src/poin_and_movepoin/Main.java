package poin_and_movepoin;

public class Main {
    public static void main(String[] args) {
        MoveAblePoint one = new MoveAblePoint(1,1, 2,2);
        System.out.println(one);
        MoveAblePoint two = one.move();
        System.out.println(two);
    }
}
