package domain;
import view.InputView;

public class CreateCar {
    public static Car[] createCar() {
        String[] name = InputView.getCarNames();
        Car[] cars = new Car[name.length];

        for (int i = 0; i < name.length; i++) {
            cars[i] = new Car(name[i].trim());
        }
        return cars;
    }
}
