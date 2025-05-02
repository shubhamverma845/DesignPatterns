package factory.factorymethod;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new ChicagoStyleCheezePizza();
            case "veggie" -> new ChicagoStyleVeggiePizza();
            case "clam" -> new ChicagoStyleClamPizza();
            case "pepperoni" -> new ChicagoStylePepperoniPizza();
            default -> null;
        };
    }
}
