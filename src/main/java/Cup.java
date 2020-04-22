public class Cup {

    private Die[] dice;

    //constructor
    public Cup(int numberDice){
        if(numberDice < 1){
            throw new IllegalArgumentException("you can't have less than one die...");
        }

        this.dice = new Die[numberDice];

        //instantiate each die
        for (int i = 0; i < numberDice; i++) {
            dice[i] = new Die();
        }
    }

    //roll the dice of the cup
    public void roll(){
        for (Die d:
             dice) {
            d.roll();
        }
    }

    public int getTotal(){
        int faceValues = 0;

        for (Die d:
             dice) {
            faceValues += d.getFaceValue();
        }

        return faceValues;
    }
}
