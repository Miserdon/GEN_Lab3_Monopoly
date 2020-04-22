<<<<<<< HEAD
/*
=======
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

>>>>>>> e7d7198fdfcbf1975668f680d4ce63eeafcd5b37
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
*/