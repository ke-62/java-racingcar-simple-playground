package view;

import domain.Car;
import domain.Cars;

public class ResultView {
    public static void printRoundResult(Cars cars) {
        for (Car car : cars.getCars()) {
            String dashes = "-".repeat(car.getPosition());
            System.out.println(car.getName() + " : " + dashes);
        }
        System.out.println();
    }

    public static void printWinner(String winnerNames) {
        System.out.println(winnerNames + "가 최종 우승했습니다.");
    }
}
