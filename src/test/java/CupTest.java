import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {

    @Test
    void testWith0die() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Cup(0);
        });
    }

    @Test
    void testWithNegativeDice() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Cup(-2);
        });
    }

    @Test
    void testConstructionCup() {
        Cup cup = new Cup(2);
        assertNotNull(cup);
    }

    @Test
    void testIncrementingTotalFVNot0(){
        Cup cup = new Cup(2);
        cup.roll();
        assertNotEquals(0, cup.getTotal());

    }

    @Test
    void testIncrementingTotalFVNotNull(){
        Cup cup = new Cup(2);
        cup.roll();
        assertNotNull(cup.getTotal());
    }

    @Test
    void testIncrementingTotalFVNotNegative(){
        Cup cup = new Cup(2);
        cup.roll();

        assertFalse( cup.getTotal() < 0);
    }

    @Test
    void testIncrementingTotalFVNotTooBig(){
        Cup cup = new Cup(2);
        cup.roll();

        assertTrue( cup.getTotal() <= 12);
    }
}