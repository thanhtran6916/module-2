import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest2 {
    NextDayCalculator a;

    @Test
    @DisplayName("test 1/1/2018")
    void nextDay1() {
        int day = 1;
        int month = 1;
        int year = 2018;
        a = new NextDayCalculator(day, month, year);
        String result = a.nextDay();
        String expected = "2 1 2018";
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("test 2/1/2018")
    void nextDay2() {
        int day = 1;
        int month = 1;
        int year = 2018;
        a = new NextDayCalculator(day, month, year);
        String result = a.nextDay();
        String expected = "2 1 2018";
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("test 31/1/2018")
    void nextDay3() {
        int day = 31;
        int month = 1;
        int year = 2018;
        a = new NextDayCalculator(day, month, year);
        String result = a.nextDay();
        String expected = "1 2 2018";
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("test 30/4/2018")
    void nextDay4() {
        a = new NextDayCalculator(30, 4, 2018);
        String result = a.nextDay();
        String expected = "1 5 2018";
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("test 28/2/2018")
    void nextDay5() {
        a = new NextDayCalculator(28, 2, 2018);
        String result = a.nextDay();
        String expected = "1 3 2018";
        assertEquals(result, expected);
    }

    @Test
    @DisplayName("28/2/2018")
    void nextDay6() {
        a = new NextDayCalculator(28, 2, 2018);
        String result = a.nextDay();
        String expected = "1 3 2018";
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("test 29/2/2020")
    void nextDay7() {
        a = new NextDayCalculator(29, 2, 2020);
        String result = a.nextDay();
        String expected = "1 3 2020";
        assertEquals(result, expected);
    }

    @Test
    @DisplayName("Test 31/12/2018")
    void next8() {
        a = new NextDayCalculator(31, 12, 2018);
        String result = a.nextDay();
        String expected = "1 1 2019";
        assertEquals(expected, result);
    }
}