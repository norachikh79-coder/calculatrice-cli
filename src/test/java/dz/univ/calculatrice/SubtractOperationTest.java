package dz.univ.calculatrice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SubtractOperationTest {

    @Test
    void testNominalSubtraction() {
        final Operation operation = new SubtractOperation();
        assertEquals(2.0, operation.calculer(5.0, 3.0), 0.0001);
    }

    @Test
    void testNegativeNumbers() {
        final Operation operation = new SubtractOperation();
        assertEquals(-2.0, operation.calculer(-5.0, -3.0), 0.0001);
    }

    @Test
    void testDecimalNumbers() {
        final Operation operation = new SubtractOperation();
        assertEquals(1.2, operation.calculer(3.7, 2.5), 0.0001);
    }
}
