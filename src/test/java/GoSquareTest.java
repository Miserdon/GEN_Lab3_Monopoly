import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoSquareTest {


    private  Player gamer;

    @BeforeEach
    public void createPlayer(){
        Board testBoard = new Board();
        Square pos = testBoard.getSquare(7);
        Cup cup = new Cup(2);

        gamer = new Player("Test_Player",PlayerPieceType.BOOT, testBoard,pos,cup);
    }

    @Test
    public void testNameGo(){
        Square go = new GoSquare();
        assertEquals("Go", go.getName());
    }

    @Test
    public void testLandGo(){
        int expected = 1700;
        Square go = new GoSquare();
        go.landedON(gamer);
        assertEquals(expected, gamer.getNetWorth());
    }

}