import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class RaceStart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car[] carArray = CreateCar.createCar();
        List<Car> carList = Arrays.asList(carArray);
        Cars cars = new Cars(carList);

        System.out.println("시도할 회수는 몇회인가요?");
        int rounds = scanner.nextInt();
        System.out.println("");
        System.out.println("실행 결과");

        RaceController raceController = new RaceController();
        raceController.startRace(cars, rounds);

        Winner winner = new Winner();
        winner.findWinner(cars);

        scanner.close();
    }
}
