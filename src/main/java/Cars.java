import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> carList) {
        this.cars = carList;
    }

    public StringBuilder findWinnerNames() {
        int maxPosition = findMaxPosition();
        return buildWinnerNames(maxPosition);
    }

    private int findMaxPosition() {
        int maxPosition = 0;
        for (Car car : cars) {
            maxPosition = Math.max(maxPosition, car.getPosition());
        }
        return maxPosition;
    }

    private StringBuilder buildWinnerNames(int maxPosition) {
        StringBuilder winnerNames = new StringBuilder();
        for (Car car : cars) {
            appendWinnerName(car, maxPosition, winnerNames);
        }
        return winnerNames;
    }

    private void appendWinnerName(Car car, int maxPosition, StringBuilder winnerNames) {
        if (car.getPosition() == maxPosition) {
            winnerNames.append(car.getName());
        }
    }

    public Car[] getCars() {
        return cars.toArray(new Car[0]);
    }
}