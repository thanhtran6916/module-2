import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    @Test
    @DisplayName("test 2 2 2")
    public void test1() {
        String result = TriangleClassifier.triangle(2, 2, 2);
        String expected = "tam giác đều";
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("test 2 2 3")
    public void test2() {
        String result = TriangleClassifier.triangle(2, 2, 3);
        String expected = "tam giác cân";
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("test 3 4 5")
    public void test3() {
        String result = TriangleClassifier.triangle(3, 4, 5);
        String expected = "tam giác thường";
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("test 8 2 3")
    public void test4() {
        String result = TriangleClassifier.triangle(8, 2, 3);
        String expected = "không phải tam giác";
        assertEquals(expected, result);
    }

}