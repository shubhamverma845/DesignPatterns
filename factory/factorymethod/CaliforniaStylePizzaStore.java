package factory.factorymethod;


public class CaliforniaStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new CaliforniaStyleCheezePizza();
            case "veggie" -> new CaliforniaStyleVeggiePizza();
            case "clam" -> new CaliforniaStyleClamPizza();
            case "pepperoni" -> new CaliforniaStylePepperoniPizza();
            default -> null;
        };
    }
}
