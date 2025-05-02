package factory.factorymethod;


public class NYStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new NYStyleCheezePizza();
            case "veggie" -> new NYStyleVeggiePizza();
            case "clam" -> new NYStyleClamPizza();
            case "pepperoni" -> new NYStylePepperoniPizza();
            default -> null;
        };
    }
}
