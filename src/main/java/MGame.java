public class MGame {

    private static final int NB_DIE = 2;
    private static final int NB_ROUNDS = 20;
    private Board board;
    private Player[] players;
    private Die[] dice;
    private int roundCounter;


    // constructor
    public MGame(int numberPlayers){
        //assertions
        if (numberPlayers < 2) {
            throw new IllegalArgumentException("Number of players should be greater than 2");
        } else if(numberPlayers > 8 ){
            throw new IllegalArgumentException("Number of players should be less than 8");
        }

        this.board = new Board();
        this.players = new Player[numberPlayers];
    }
}
