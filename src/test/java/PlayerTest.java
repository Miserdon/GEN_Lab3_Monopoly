import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {



    @Test
    public void creationOfPlayerJohnny(){
        Board board = new Board();
        Square pos = board.getSquare(7);
        Die[] dice = new Die[2];
        for (int i = 0; i < 2; i++){
            dice[i] = new Die();
        }
        Player p = new Player("Johnny", PlayerPieceType.RACING_CAR, board, pos, dice);

        assertNotNull(p);

    }

}