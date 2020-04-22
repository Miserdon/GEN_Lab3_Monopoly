import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DieTest {

    private Die die;

    @BeforeEach
    public void initDie(){
        die = new Die();

    }

    @RepeatedTest(100)
    void getFaceValueInRange1to6() {

        die.roll();
        assertTrue(die.getFaceValue() > 0 && die.getFaceValue() < 7, "Error die value not between 1 and 6");
    }


}