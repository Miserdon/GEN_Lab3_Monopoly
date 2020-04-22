public class Piece {

    private Square position;

    // constructor
    public Piece(Square position){
        this.position = position;
    }

    // seter
    public void setPosition(Square position){
        this.position = position;
    }
    // geter
    public Square getPosition(){
        return position;
    }
}
