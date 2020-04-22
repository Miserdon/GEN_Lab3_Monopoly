import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MGameTest {

    //@BeforeAll

    @Test
    public void notEnoughPlayerException(){
        Exception ex =  assertThrows(IllegalArgumentException.class, () ->  new MGame(1));
        assertEquals("Number of players should be greater than 2", ex.getMessage());

    }

    @Test
    public void tooManyPlayerException(){
        Exception ex =  assertThrows(IllegalArgumentException.class, () ->  new MGame(10));
        assertEquals("Number of players should be less than 8", ex.getMessage());

    }

    @Test
    public void runGameTest(){
        MGame game = new MGame(5);
        game.playGame();
    }

    


}