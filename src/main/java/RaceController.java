public class RaceController {
    public void startRace(Cars car, int rounds) {
        MoveCondition moveCondition = new MoveCondition();

        for (int round = 0; round < rounds; round++) {
            runRound(car, moveCondition);
        }
        System.out.println();
    }

    private void runRound(Cars cars, MoveCondition moveCondition) {
        for (Car car : cars.getCars()) {
            int randomNumber = moveCondition.randomNumber();
            car.move(randomNumber);
        }

        for (Car car : cars.getCars()) {
            String dashes = "-".repeat(car.getPosition());
            System.out.println(car.getName() + " : " + dashes);
        }
        System.out.println();
    }
}
