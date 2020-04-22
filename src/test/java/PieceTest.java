/*
class PieceTest {
   private Square initialPos;
   private Piece initialPiece;

    @BeforeEach
    void setupPieceWithInitialPos() {
         initialPos = new Square("initial");
         initialPiece = new Piece(initialPos);
    }

    @Test
    void constructorWorksWithPositionAndGetterWorks() {
        assertEquals(initialPiece.getPosition(),initialPos);
    }

    @Test
    void setPositionWorksAsExpected() {
        Square secondPosition = new Square("second place");
        Square thirdPosition = new Square("third place");
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
}*/