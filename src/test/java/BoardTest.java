import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
        assertThrows(IllegalArgumentException.class,() -> board.getSquare(BOARD_SIZE + 1));

    }
}