package factory.simplefactory;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {

        return switch (type) {
            case "cheese" -> new CheezePizza();
            case "pepperoni" -> new PepperoniPizza();
            case "clam" -> new ClamPizza();
            case "veggie" -> new VeggiePizza();
            default -> null;
        };
    }
}
