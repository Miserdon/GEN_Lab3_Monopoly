public class Player {
    private static int BASE_NET_WORTH = 1500;

    private String name;
    private PlayerPieceType pieceToken;
    private Board board;
    private Piece piece;
    private Die[] dice;
    private int netWorth;

    public Player(String name, PlayerPieceType token, Board board, Square pos, Die[] dice){
        this.name = name;
        this.pieceToken = token;
        this.piece = new Piece(pos);
        this.board = board;
        this.netWorth = BASE_NET_WORTH;
    }

    /**
     *
     * @return the netWorth of the player (int)
     */
    public int getNetWorth(){
        return this.netWorth;
    }

    /**
     *
     * @param amount
     * @throws IllegalArgumentException if the amount is negative or null
     */
    public void addCash(int amount) throws IllegalArgumentException{
        if(amount > 0){
            this.netWorth += amount;
        }else{
            throw  new IllegalArgumentException();
        }

    }

    public void reduceCash(int amount) throws IllegalArgumentException{
        if(amount > 0){
            //so we never end up with a negative amount of money, if amount exceeds networth, we just set it to 0
           netWorth = Math.max(netWorth - amount, 0);
        }else{
            throw new IllegalArgumentException();
        }
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
