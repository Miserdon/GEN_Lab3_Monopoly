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
        this.roundCounter = 0;

        // create the dice
        this.dice = new Die[NB_DIE];
        for (int i = 0; i < NB_DIE; i++){
            dice[i] = new Die();
        }

        // create the players
        this.players = new Player[numberPlayers];
        int playerID = 0;

        for (int i = 0; i < numberPlayers; i++) {
            String playerName = "Player " + playerID;
            PlayerPieceType token = PlayerPieceType.values()[i];
            players[i] = new Player(playerName, token, board, board.getSquare(0), dice);

        }
    }

    private void playRound(){

        // make each player play their turn
        for (Player p:
             players) {
            p.takeTurn();
        }
    }


    public void playGame(){
        while(roundCounter < NB_ROUNDS){
            playRound();
            roundCounter++;
        }

    }
}
