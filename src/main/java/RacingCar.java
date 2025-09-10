import java.util.Scanner;

public class RacingCar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rounds = scanner.nextInt(); //라운드 횟수 입력
        int n = scanner.nextInt(); // 차 갯수 입력
        Car[] cars = new Car[n];

        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            cars[i] = new Car(name);
        }

        RaceManage raceManage = new RaceManage();
        raceManage.startRace(cars, rounds);

        Winner winner = new Winner();
        winner.findWinner(cars);

        scanner.close();
    }
}