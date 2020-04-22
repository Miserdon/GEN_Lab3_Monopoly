public class MGame {

    private static final int NB_DIE = 2;
    private static final int NB_ROUNDS = 20;
    private Board board;
    private Player[] players;
    private Cup cup;
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
        this.cup = new Cup(NB_DIE);

        // create the players
        this.players = new Player[numberPlayers];
        int playerID = 0;

        for (int i = 0; i < numberPlayers; i++) {
            String playerName = "Player " + playerID;
            PlayerPieceType token = PlayerPieceType.values()[i];
            players[i] = new Player(playerName, token, board, board.getSquare(0), cup);
            playerID++;

        }
    }

    private void playRound(){

        // make each player play their turn
        for (int i = 0; i < players.length; i++) {
            players[i].takeTurn();
        }
    }


    public void playGame(){
        System.out.println("Starting of the Monopoly game !");
        while(roundCounter < NB_ROUNDS){
            System.out.println("------------ Begining of the round #" + (roundCounter+1) + " ------------");
            playRound();
            roundCounter++;
        }

    }
}
