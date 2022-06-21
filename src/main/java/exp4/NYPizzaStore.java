package exp4;

public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        pizza = new CheesePizza(ingredientFactory);

        pizza.setName("New York Style Cheese Pizza");
        return pizza;


    }
}

