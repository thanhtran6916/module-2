package StopWatch;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        StopWatch startStop = new StopWatch();

        startStop.star();

        int[] arrNumber = arrNumber(1000000);
        for (int value : arrNumber) {
            System.out.println(value);
        }

        startStop.end();
        System.out.println("Time is " + startStop.getElapsedTime());
    }

    public static int[] arrNumber(int number) {
        int[] numberArr = new int[number];
        for (int i = 0; i < numberArr.length; i++) {
            double random = Math.random();
            numberArr[i] = (int) (random * number);
        }
        return numberArr;
    }
}
