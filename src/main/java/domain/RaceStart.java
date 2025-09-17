package domain;
import java.util.List;
import java.util.Arrays;
import view.InputView;
import view.ResultView;

public class RaceStart {
    public static void main(String[] args) {
        Car[] carArray = CreateCar.createCar();
        List<Car> carList = Arrays.asList(carArray);
        Cars cars = new Cars(carList);

        RaceController raceController = new RaceController();
        raceController.startRace(cars, InputView.readRounds());

        String winnerNames = cars.findWinnerNames().toString();
        ResultView.printWinner(winnerNames);
    }
}
