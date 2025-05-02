package factory.simplefactory;


public class PizzaStore {

    SimplePizzaFactory pizzaFactory;

    public PizzaStore(SimplePizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }


    public Pizza orderPizza(String type) {
        Pizza pizza;

        //Simple Factory
        pizza = this.pizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
