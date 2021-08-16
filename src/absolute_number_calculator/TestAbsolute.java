package absolute_number_calculator;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestAbsolute {
    AbsoluteNumberCalculator number = new AbsoluteNumberCalculator();
    @Test
    @DisplayName("test 0")
    void test0() {
        int numberTest = 0;
        int expected = 0;
        number.setNumber(numberTest);
        int result = number.getNumber();
        assertEquals(expected, result);

    }

}
