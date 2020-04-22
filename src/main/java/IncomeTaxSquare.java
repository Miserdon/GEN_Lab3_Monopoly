public class IncomeTaxSquare extends  Square{
    /**
     * default constructor
     */
    public IncomeTaxSquare(){
        super("IncomeTax");
    }

    /**
     * removes money from the player, amount equal to 10% of his networth (200 maximum)
     * @param gamer
     */
    @Override
    public void landedON(Player gamer) {
        int netWorth = gamer.getNetWorth();
        gamer.reduceCash(Math.min(200,(int) (0.1 * netWorth)));
    }
}
