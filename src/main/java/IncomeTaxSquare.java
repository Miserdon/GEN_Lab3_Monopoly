public class IncomeTaxSquare extends  Square{
    /**
     * default constructor
     */
    public IncomeTaxSquare(){
        super("IncomeTax");
    }

    /**
     * removes money from the player, amount equal to 10% of his networth (200 maximum)
     * @param gaymer
     */
    @Override
    public void landedON(Player gaymer) {
        int netWorth = gaymer.getNetWorth();
        gaymer.reduceCash(Math.min(200,(int) (0.1 * netWorth)));
    }
}
