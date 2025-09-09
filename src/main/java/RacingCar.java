import java.util.Scanner;

public class RacingCar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Car [] cars = new Car[n];

        for(int i=0; i<n; i++){
            String name = scanner.next();
            cars[i] = new Car(name);
        }

        CarMove carMove = new CarMove();

        for (int round = 0; round < 5; round++) {
            for (int i = 0; i < n; i++) {
                carMove.randomMove(cars[i]);
                System.out.println(cars[i].getName() + ":" + cars[i].getPosition());
            }
        }
        System.out.println();

        for(int i=0;i<cars.length;i++){
            System.out.println(cars[i].getName() + ":" + cars[i].getPosition());
        }
        Winner winner = new Winner();
        winner.findWinner(cars);

        scanner.close();
    }
}
