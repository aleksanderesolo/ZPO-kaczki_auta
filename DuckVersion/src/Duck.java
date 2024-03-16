public class Duck {
    FlyingBehavior flyingBehavior;
    QuackBehavior quackBehavior;

    public Duck(){
    }
    public void setFlyingBehavior(FlyingBehavior flyingBehavior){
    }

    public Duck(FlyingBehavior flyingBehavior, QuackBehavior quackBehavior) {
        this.flyingBehavior = flyingBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void swim(){
        System.out.println("Duck in swimming");
    }
    public void preformFly(){
        flyingBehavior.fly();
    }
    public void preformQuack(){
        quackBehavior.quack();
    }
}
