package strategy.duck;

public class Quack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("strategy.duck.Quack");
    }
}
