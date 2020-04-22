public class Piece {

    private Square position;

    // constructor
    public Piece(Square position){
        if(position == null)
            throw new IllegalArgumentException("Can't create Piece with null position square");
        this.position = position;
    }

    // seter
    public void setPosition(Square position){
        if(position == null)
            throw new IllegalArgumentException("Can't set Piece position to null square");
        this.position = position;
    }
    // geter
    public Square getPosition(){
        return position;
    }
}
