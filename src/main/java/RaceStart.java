import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class RaceStart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car[] carArray = CreateCar.createCar();
        List<Car> carList = Arrays.asList(carArray);
        Cars cars = new Cars(carList);

        int rounds = RaceRound.RaceRound();

        RaceController raceController = new RaceController();
        raceController.startRace(cars, rounds);

        Winner winner = new Winner();
        winner.findWinner(cars);

        scanner.close();
    }
}
