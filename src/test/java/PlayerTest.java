

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PlayerTest {
    private  Player gaymer;

    @BeforeEach
    public void createPlayer(){
        Board testBoard = new Board();
        Square pos = testBoard.getSquare(7);
        Die[] dice = new Die[2];

        gaymer = new Player("Test_Player",PlayerPieceType.BOOT, testBoard,pos,dice);
    }

    @Test
    public void testBaseNetWorth(){
        assertEquals(1500, gaymer.getNetWorth());
    }

    @ParameterizedTest
    @ValueSource (ints = {0, -15})
    public void testInvalidAddAmount(int amount){
        assertThrows(IllegalArgumentException.class , () -> {gaymer.addCash(amount);});
    }

    @ParameterizedTest
    @ValueSource (ints = {0, -15})
    public void testInvalidReduceAmount(int amount){
        assertThrows(IllegalArgumentException.class , () -> {gaymer.reduceCash(amount);});
    }

    @ParameterizedTest
    @ValueSource (ints = {5,500,2000})
    public void testValidAdd(int amount){
        //we have base money because of the beforeEach
        int expected = gaymer.getNetWorth() + amount;
        gaymer.addCash(amount);
        int netWorth = gaymer.getNetWorth();
        assertEquals(expected, netWorth);
    }

    @ParameterizedTest
    @ValueSource (ints = {5,500,2000})
    public void testValidReduce(int amount){
        //we have base money because of the beforeEach
        int expected = Math.max(gaymer.getNetWorth() - amount, 0);
        gaymer.reduceCash(amount);
        int netWorth = gaymer.getNetWorth();
        assertEquals(expected, netWorth);
    }



}