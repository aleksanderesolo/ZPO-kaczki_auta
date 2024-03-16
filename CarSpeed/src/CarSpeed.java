public class CarSpeed {

    Strategy strategy;

    public void setStrategy(Strategy s){
        strategy = s;
    }

    public int getMaxSpeed(){
        return strategy.getMaxSpeed();
    }

    public void showCarName(){
        System.out.println(strategy.getCarName());
    }
}
