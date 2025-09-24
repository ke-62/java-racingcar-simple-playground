import java.util.Random;

public class MoveCondition {
    private static final int MAX_NUMBER = 10;
    Random random = new Random();
    public int randomMove(){
        return  random.nextInt(MAX_NUMBER);
    }
}