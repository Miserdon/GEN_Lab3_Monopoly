public class GoSquare extends Square {
    private static int MONEY_GAINED = 200;
    /**
     * default constructor
     */
    public GoSquare(){
        super("Go");
    }

    /**
     * adds money to the player that landed on the go square
     * @param gaymer the player in question
     */
    @Override
    public void landedON(Player gaymer) {
        gaymer.addCash(MONEY_GAINED);
    }
}
