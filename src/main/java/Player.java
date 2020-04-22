public class Player {

    private String name;
    private PlayerPieceType pieceToken;
    private Board board;
    private Piece piece;
    private Die[] dice;

    public Player(String name, PlayerPieceType token, Board board, Square pos, Die[] dice){
        this.name = name;
        this.pieceToken = token;
        this.piece = new Piece(pos);
        this.board = board;
        this.dice = dice;
    }

    // method to make a player turn
    public void takeTurn(){
        int totalFaceValue = 0;

        //need to roll the 2 dice
        for (Die die:
             dice) {
            die.roll();
            int fv = die.getFaceValue();
            totalFaceValue += fv;

        }

        Square current = piece.getPosition();

        try{
            // compute next position
            Square next = board.getNextSquare(current, totalFaceValue);

            if(next == null){
                System.out.println("Impossible move");

            } else {
                piece.setPosition(next);
            }
        } catch(IllegalArgumentException e){
            System.out.println(e.toString());
        }


    }

}
