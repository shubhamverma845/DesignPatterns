package strategy;

public class FlyRocketPowered implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("I'm flying with Rocket!!");
    }
}
