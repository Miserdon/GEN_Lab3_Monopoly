import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PieceTest {
   private Square initialPos;
   private Piece initialPiece;

    @BeforeEach
    void setupPieceWithInitialPos() {
         initialPos = new RegularSquare(1);
         initialPiece = new Piece(initialPos);
    }

    @Test
    void constructorWorksWithPositionAndGetterWorks() {
        assertEquals(initialPiece.getPosition(),initialPos);
    }


    @Test
    void setPositionWorksAsExpected() {
        Square secondPosition = new RegularSquare(2);
        Square thirdPosition = new RegularSquare(3);
        initialPiece.setPosition(secondPosition);
        assertEquals(initialPiece.getPosition(),secondPosition);
        initialPiece.setPosition(thirdPosition);
        assertEquals(initialPiece.getPosition(),thirdPosition);
    }

    @Test
    void constructorFailWithNullPositionGiven() {
        assertThrows(IllegalArgumentException.class,() -> new Piece(null));
    }

    @Test
    void setPositionFailWithNullArgument() {
        assertThrows(IllegalArgumentException.class,() -> initialPiece.setPosition(null));
    }
}