import java.util.Scanner;

public class RaceRound {

    public static int RaceRound() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("시도할 회수는 몇회인가요?");
        int rounds = scanner.nextInt();
        System.out.println();
        System.out.println("실행 결과");
        return rounds;
    }
}

