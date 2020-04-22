import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncomeTaxSquareTest {

    private  Player gamer;

    @BeforeEach
    public void createPlayer(){
        Board testBoard = new Board();
        Square pos = testBoard.getSquare(7);
        Cup cup = new Cup(2);

        gamer = new Player("Test_Player",PlayerPieceType.BOOT, testBoard,pos,cup);
    }

    @Test
    public void testNameTax(){
        Square tax = new IncomeTaxSquare();
        assertEquals("IncomeTax", tax.getName());
    }



    @Test
    public void testLandTaxPercent(){
        int expected = 1500 - ((int) (0.1 * 1500));
        Square tax = new IncomeTaxSquare();
        tax.landedON(gamer);
        assertEquals(expected, gamer.getNetWorth());
    }

    @Test
    public void testLandTaxMax(){
        int expected = 1900;
        gamer.addCash(600);
        Square tax = new IncomeTaxSquare();
        tax.landedON(gamer);
        assertEquals(expected, gamer.getNetWorth());
    }

}