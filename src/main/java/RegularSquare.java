public class RegularSquare extends Square {

    public RegularSquare(int indx){
        super("Square" + indx);
    }
    /**
     * override that does nothing
     * @param gaymer the player that landed on this square
     */
    @Override
    public void landedON(Player gaymer) {
        //do nothing
    }
}
