//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Passat pasat = new Passat();
        CarSpeed carSpeed = new CarSpeed();

        carSpeed.setStrategy(pasat);

        carSpeed.showCarName();
        System.out.println(carSpeed.getMaxSpeed());

        carSpeed.setStrategy(new Toyota());

        carSpeed.showCarName();
        System.out.println(carSpeed.getMaxSpeed());

        carSpeed.setStrategy(new Bugatti());

        carSpeed.showCarName();
        System.out.println(carSpeed.getMaxSpeed());
    }
}