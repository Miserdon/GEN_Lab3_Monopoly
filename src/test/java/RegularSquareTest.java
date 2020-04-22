import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularSquareTest {

    private  Player gamer;

    @BeforeEach
    public void createPlayer(){
        Board testBoard = new Board();
        Square pos = testBoard.getSquare(7);
        Cup cup = new Cup(2);

        gamer = new Player("Test_Player",PlayerPieceType.BOOT, testBoard,pos,cup);
    }

    @Test
    public void testNameRegular(){
        Square reg = new RegularSquare(15);
        assertEquals("Square 15", reg.getName());
    }

}