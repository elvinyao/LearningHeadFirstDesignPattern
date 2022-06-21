package exp4;

public class ChicagoPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {

        return new ChicagoStyleCheesePizza();


    }
}
