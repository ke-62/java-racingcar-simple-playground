import java.util.Random;

public class MoveCondition {

    public void randomMove(Car car){
        Random random = new Random();

        int randomNumber = random.nextInt(10); // 0부터 9까지의 랜덤 숫자 생성
        System.out.println("랜덤변수 : " + randomNumber);
        car.move(randomNumber);
    }
}