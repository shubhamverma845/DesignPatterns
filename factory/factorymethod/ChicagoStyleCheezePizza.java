package factory.factorymethod;

public class ChicagoStyleCheezePizza extends Pizza {

    public ChicagoStyleCheezePizza() {
        name = "Chicago Style Deep Dish Cheeze Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }


}
