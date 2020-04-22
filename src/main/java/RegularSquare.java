public class RegularSquare extends Square {

    public RegularSquare(int indx){
        super("Square " + indx);
    }
    /**
     * override that does nothing
     * @param gamer the player that landed on this square
     */
    @Override
    public void landedON(Player gamer) {
        //do nothing
    }
}
