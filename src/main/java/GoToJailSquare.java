public class GoToJailSquare extends Square{
    private Square jail;

    public GoToJailSquare(Square jail){
        super("GoToJail");
        this.jail = jail;
    }
    /**
     *  moves the player to the jail square (which has already been determined when we created this object)
     * @param gaymer
     */
    @Override
    public void landedON(Player gaymer) {
        gaymer.setLocation(jail);
    }
}
