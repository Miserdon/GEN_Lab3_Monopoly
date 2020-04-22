import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class BoardTest {
    Board board;
    private int BOARD_SIZE = 40;

    @BeforeEach
    void initializeBasicBoard() {
        board = new Board();
    }
    @Test
    void constructorCreateNotNullObject() {
        assertNotNull(board);
    }

    @Test
    void constructorInitializeCorrectBoard() {
        for(int i = 0;i < BOARD_SIZE; ++i) {
            assertNotNull(board.getSquare(i));
        }
    }

    @Test
    void methodsFailsWithIllegalArguments() {
        assertThrows(IllegalArgumentException.class,() -> board.getNextSquare(board.getSquare(0),1));
        assertThrows(IllegalArgumentException.class,() -> board.getNextSquare(null,2));
        assertThrows(IllegalArgumentException.class,() -> board.getNextSquare(board.getSquare(0),13));
        assertThrows(IllegalArgumentException.class,() -> board.getSquare(-1));
        assertThrows(IllegalArgumentException.class,() -> board.getSquare(BOARD_SIZE ));

    }

    @Test
    void GoToJailPosition(){
        assertEquals("GoToJail", board.getSquare(30).getName(), "GotToJail Square is not at its correct position, 30");
    }

    @Test
    void GoPosition(){
        assertEquals("Go", board.getSquare(0).getName(), "Go Square is not at its correct position, 0");
    }

    @Test
    void IncomeTaxSquarePosition(){
        assertEquals("IncomeTax", board.getSquare(4).getName(), "IncomeTax Square is not at its correct position, 4");
    }

    @Test
    void moveToDesiredNextSquare(){
        assertEquals("Square 7", board.getNextSquare(board.getSquare(0), 7).getName());
        assertEquals("Square 11", board.getNextSquare(board.getSquare(0), 11).getName());
    }

    @Test
    void correctlyMovedToJail(){

        Square jail = new GoToJailSquare(null);
        assertEquals("GoToJail", jail.getName());

    }
}
