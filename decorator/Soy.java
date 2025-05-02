package decorator;

public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return beverage.cost() + 0.15;
//        return beverage.cost() + 0.15 + ((size.ordinal() - 1) * 0.05);
    }
}
