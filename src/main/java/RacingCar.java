import java.util.Scanner;

public class RacingCar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rounds = scanner.nextInt();
        int n = scanner.nextInt();
        Car [] cars = new Car[n];

        for(int i=0; i<n; i++){
            String name = scanner.next();
            cars[i] = new Car(name);
        }

        CarMove carMove = new CarMove();

        for (int j = 0; j < 5; j++) {
            runRound(cars, carMove);
        }
        System.out.println();

        System.out.println("[최종 결과]");
        for(int i=0;i<cars.length;i++){
            String dashes = "-".repeat(cars[i].getPosition());
            System.out.println(cars[i].getName() + " : " + dashes);
        }

        Winner winner = new Winner();
        winner.findWinner(cars);

        scanner.close();
    }

    private static void runRound(Car[] cars, CarMove carMove) {
        for (int i = 0; i < cars.length; i++) {
            carMove.randomMove(cars[i]);
        }

        for (Car car : cars) {
            String dashes = "-".repeat(car.getPosition());
            System.out.println(car.getName() + " : " + dashes);
        }
        System.out.println();
    }
}