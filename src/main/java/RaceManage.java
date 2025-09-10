public class RaceManage {
    public void startRace(Car[] cars, int rounds) {
        CarMove carMove = new CarMove();

        for (int round = 0; round < rounds; round++) {
            runRound(cars, carMove);
        }
        System.out.println();
    }

    private void runRound(Car[] cars, CarMove carMove) {
        for (Car car : cars) {
            carMove.randomMove(car);
        }

        for (Car car : cars) {
            String dashes = "-".repeat(car.getPosition());
            System.out.println(car.getName() + " : " + dashes);
        }
        System.out.println();
    }
}
