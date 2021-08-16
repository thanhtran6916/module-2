import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static FizzBuzzTranslate a = new FizzBuzzTranslate();

    @Test
    @DisplayName("test 0")
    void test() {
        int input = 0;
        String result = a.translate(input);
        String expected = "Không đúng số nhỏ hơn 0";
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("test 3")
    void test1() {
        int input = 3;
        String result = a.translate(input);
        String expected = FIZZ;
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("test 5")
    void test2() {
        int input = 5;
        String result = a.translate(input);
        String expected = BUZZ;
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("test 15")
    void test3() {
        int input = 15;
        String expected = FIZZ + BUZZ;
        String result = a.translate(input);
        assertEquals(expected, result);
    }
}