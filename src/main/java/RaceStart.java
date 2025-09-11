import java.util.Scanner;
import java.util.Arrays;

public class RaceStart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rounds = scanner.nextInt(); //라운드 횟수 입력
        int n = scanner.nextInt(); // 차 갯수 입력
        Car[] cars = new Car[n];

        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            cars[i] = new Car(name);
        }

        Cars carsList = new Cars(Arrays.asList(cars));

        RaceController raceController = new RaceController();
        raceController.startRace(carsList, rounds);

        Winner winner = new Winner();
        winner.findWinner(carsList);

        scanner.close();
    }
}