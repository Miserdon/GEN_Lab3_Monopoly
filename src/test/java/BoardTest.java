import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    Board board;
    private  int BOARD_SIZE;
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
        Square[] squares = new Square[BOARD_SIZE];
        Square current = new Square("Go");
        for(int i = 0;i < BOARD_SIZE; ++i) {
            squares[i] = board.getNextSquare(current,2);
        }
    }
}