public class GoToJailSquare extends Square{
    private Square jail;

    public GoToJailSquare(Square jail){
        super("GoToJail");
        this.jail = jail;
    }
    /**
     *  moves the player to the jail square (which has already been determined when we created this object)
     * @param gamer
     */
    @Override
    public void landedON(Player gamer) {
        gamer.setLocation(jail);
    }
}
