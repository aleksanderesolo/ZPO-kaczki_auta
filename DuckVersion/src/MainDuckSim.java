import java.util.ArrayList;

public class MainDuckSim extends Duck {

    public MainDuckSim() {
    }
    public MainDuckSim(FlyingBehavior flyingBehavior, QuackBehavior quackBehavior) {
        super(flyingBehavior, quackBehavior);
    }

    public static void main(String[] args) {

        Duck duck1 = new MallarDuck(new FlyingWithWings(), new Squeak());
        duck1.preformFly();
        duck1.preformQuack();

        ArrayList<Duck> kaczki = new ArrayList<>();
        kaczki.add(new MallarDuck(new FlyingWithWings(), new MuteQuack()));
        kaczki.add(new RubberDuck(new FlyingNoWay(), new Squeak()));
        kaczki.add(new ModelDuck(new FlyingNoWay(), new MuteQuack()));

        kaczki.get(1).setFlyingBehavior(new FlyingBehavior() {
            @Override
            public void fly() {
                System.out.println("Duck is flying with jetpack");
            }
        });

        for (Duck duck : kaczki) {
            duck.preformFly();
            duck.preformQuack();
        }
    }
}