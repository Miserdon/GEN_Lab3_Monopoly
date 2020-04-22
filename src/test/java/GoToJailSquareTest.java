import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoToJailSquareTest {

    private  Player gamer;

    @BeforeEach
    public void createPlayer(){
        Board testBoard = new Board();
        Square pos = testBoard.getSquare(7);
        Cup cup = new Cup(2);

        gamer = new Player("Test_Player",PlayerPieceType.BOOT, testBoard,pos,cup);
    }
    @Test
    public void testNameJail(){
        Square jail = new GoToJailSquare(null);
        assertEquals("GoToJail", jail.getName());
    }

    @Test
    public void testGoingToJail(){
        Board board = new Board();
        Square jail = board.getSquare(10);
        gamer.setLocation(new GoToJailSquare(jail));
        gamer.getPosition().landedON(gamer);

        assertSame(jail, gamer.getPosition());
    }
}