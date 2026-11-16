package dz.univ.calculatrice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AddOperationTest {

    @Test
    void testAdditionPositiveNumbers() {
        AddOperation addition = new AddOperation();
        assertEquals(15.5, addition.calculer(12.5, 3));
    }

    @Test
    void testAdditionNegativeNumbers() {
        AddOperation addition = new AddOperation();
        assertEquals(-5, addition.calculer(-2, -3));
    }

    @Test
    void testAdditionDecimalNumbers() {
        AddOperation addition = new AddOperation();
        assertEquals(4.0, addition.calculer(1.5, 2.5));
    }
}
