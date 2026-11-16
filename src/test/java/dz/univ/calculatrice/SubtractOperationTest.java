package dz.univ.calculatrice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SubtractOperationTest {

    @Test
    void testSubtractionPositiveNumbers() {
        SubtractOperation subtraction = new SubtractOperation();
        assertEquals(9.5, subtraction.calculer(12.5, 3));
    }

    @Test
    void testSubtractionNegativeNumbers() {
        SubtractOperation subtraction = new SubtractOperation();
        assertEquals(1, subtraction.calculer(-2, -3));
    }

    @Test
    void testSubtractionDecimalNumbers() {
        SubtractOperation subtraction = new SubtractOperation();
        assertEquals(2.0, subtraction.calculer(4.5, 2.5));
    }
}
