public class Winner {

    public void findWinner(Car[] cars) {
        int maxPosition = findMaxPosition(cars);
        StringBuilder result = buildWinnerNames(cars, maxPosition);

        System.out.println(result + "가 최종 우승했습니다.");
    }

    private int findMaxPosition(Car[] cars) {
        int maxPosition = 0;
        for (Car car : cars) {
            maxPosition = Math.max(maxPosition, car.getPosition());
        }
        return maxPosition;
    }

    private StringBuilder buildWinnerNames(Car[] cars, int maxPosition) {
        StringBuilder winnerNames = new StringBuilder();
        for (Car car : cars) {
            appendWinnerName(car, maxPosition, winnerNames);
        }
        return winnerNames;
    }

    private void appendWinnerName(Car car, int maxPosition, StringBuilder winnerNames) {
        if (car.getPosition() == maxPosition) {
            winnerNames.append(car.getName()).append(" ");
        }
    }
}