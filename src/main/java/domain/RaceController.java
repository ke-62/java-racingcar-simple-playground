package domain;
import view.ResultView;

public class RaceController {
    public void startRace(Cars cars, int rounds) {
        MoveCondition moveCondition = new MoveCondition();

        for (int round = 0; round < rounds; round++) {
            runRound(cars, moveCondition);
        }
        System.out.println();
    }

    private void runRound(Cars cars, MoveCondition moveCondition) {
        for (Car car : cars.getCars()) {
            int randomNumber = moveCondition.randomNumber();
            car.move(randomNumber);
        }
        ResultView.printRoundResult(cars);
    }
}
