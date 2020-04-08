import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DieTest {



    @Test
    void getFaceValueInRange1to6() {
        Die die = new Die();
        die.roll();
        assertTrue(die.getFaceValue() > 0 && die.getFaceValue() < 7);
    }


}