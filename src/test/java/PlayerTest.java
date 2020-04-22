
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PlayerTest {
    private  Player gamer;

    @BeforeEach
    public void createPlayer(){
        Board testBoard = new Board();
        Square pos = testBoard.getSquare(7);
        Cup cup = new Cup(2);

        gamer = new Player("Test_Player",PlayerPieceType.BOOT, testBoard,pos,cup);
    }

    @Test
    public void testBaseNetWorth(){
        assertEquals(1500, gamer.getNetWorth());
    }

    @ParameterizedTest
    @ValueSource (ints = {0, -15})
    public void testInvalidAddAmount(int amount){
        assertThrows(IllegalArgumentException.class , () -> {gamer.addCash(amount);});
    }

    @ParameterizedTest
    @ValueSource (ints = {0, -15})
    public void testInvalidReduceAmount(int amount){
        assertThrows(IllegalArgumentException.class , () -> {gamer.reduceCash(amount);});
    }

    @ParameterizedTest
    @ValueSource (ints = {5,500,2000})
    public void testValidAdd(int amount){
        //we have base money because of the beforeEach
        int expected = gamer.getNetWorth() + amount;
        gamer.addCash(amount);
        int netWorth = gamer.getNetWorth();
        assertEquals(expected, netWorth);
    }

    @ParameterizedTest
    @ValueSource (ints = {5,500,2000})
    public void testValidReduce(int amount){
        //we have base money because of the beforeEach
        int expected = Math.max(gamer.getNetWorth() - amount, 0);
        gamer.reduceCash(amount);
        int netWorth = gamer.getNetWorth();
        assertEquals(expected, netWorth);
    }



}