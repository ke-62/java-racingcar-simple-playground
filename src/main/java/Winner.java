public class Winner {

    public void findWinner(Cars cars) {
        StringBuilder result = cars.findWinnerNames();
        System.out.println(result + "가 최종 우승했습니다.");
    }
}