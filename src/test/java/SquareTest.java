
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {
    private  Player gaymer;

    @BeforeEach
    public void createPlayer(){
        Board testBoard = new Board();
        Square pos = testBoard.getSquare(7);
        Cup cup = new Cup(2);

        gaymer = new Player("Test_Player",PlayerPieceType.BOOT, testBoard,pos,cup);
    }

    @Test
    public void testNameRegular(){
        Square reg = new RegularSquare(15);
        assertEquals("Square 15", reg.getName());
    }

    @Test
    public void testNameGo(){
        Square go = new GoSquare();
        assertEquals("Go", go.getName());
    }

    @Test
    public void testNameJail(){
        Square jail = new GoToJailSquare(null);
        assertEquals("GoToJail", jail.getName());
    }

    @Test
    public void testNameTax(){
        Square tax = new IncomeTaxSquare();
        assertEquals("IncomeTax", tax.getName());
    }

    @Test
    public void testLandGo(){
        int expected = 1700;
        Square go = new GoSquare();
        go.landedON(gaymer);
        assertEquals(expected, gaymer.getNetWorth());
    }

    @Test
    public void testLandTaxPercent(){
        int expected = 1500 - ((int) (0.1 * 1500));
        Square tax = new IncomeTaxSquare();
        tax.landedON(gaymer);
        assertEquals(expected, gaymer.getNetWorth());
    }

    @Test
    public void testLandTaxMax(){
        int expected = 1900;
        gaymer.addCash(600);
        Square tax = new IncomeTaxSquare();
        tax.landedON(gaymer);
        assertEquals(expected, gaymer.getNetWorth());
    }
}