package factory.abstractfactory;


public class ClientCode {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NyPizzaStore();

        Pizza cheese = pizzaStore.orderPizza("cheese");
        pizzaStore = new ChicagoPizzaStore();

        Pizza veggie = pizzaStore.orderPizza("veggie");

    }
}
