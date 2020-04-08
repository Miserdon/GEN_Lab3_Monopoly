public class Die {
    private int faceValue;
    void roll() {
        faceValue = (int) (Math.random() * 6) + 1;
    }
    int getFaceValue() {
        return faceValue;
    }
}
