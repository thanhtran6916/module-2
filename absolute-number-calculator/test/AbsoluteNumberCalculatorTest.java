import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {
    AbsoluteNumberCalculator a = new AbsoluteNumberCalculator();
    @Test
    @DisplayName("test 0")
    void test0() {
        int input = 0;
        int expected = 0;
        int result = a.findAbsolute(input);
        assertEquals(result, expected);
    }

    @Test
    @DisplayName("test -1")
    void test_1() {
        int input = -1;
        int expected = 1;
        int result = a.findAbsolute(input);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("test 1")
    void test1() {
        int input = 1;
        int expected = 1;
        int result = a.findAbsolute(input);
        assertEquals(expected, result);
    }
}