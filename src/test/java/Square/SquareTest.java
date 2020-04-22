import org.junit.jupiter.api.Test;


class SquareTest {

    @Test
    void squareReturnGoodName() {
    Square sq = new Square("testName");
    assert("testName".equals(sq.getName()));
    }

    @Test
    
}