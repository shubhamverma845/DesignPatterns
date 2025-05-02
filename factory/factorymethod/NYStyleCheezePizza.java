package factory.factorymethod;

public class NYStyleCheezePizza extends Pizza {

    public NYStyleCheezePizza() {
        name = "NY Style Sauce and Cheeze Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheeze");
    }
}
