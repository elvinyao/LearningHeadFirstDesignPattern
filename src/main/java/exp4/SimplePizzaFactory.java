package exp4;

/**
 * “The Simple Factory defined
 * The Simple Factory isn’t actually a Design Pattern; it’s more of a programming idiom.
 * But it is commonly used, so we’ll give it a Head First Pattern Honorable Mention.
 * Some developers do mistake this idiom for the Factory Pattern, but the next time that happens you can subtly show you know your stuff;
 * just don’t strut as you educate them on the distinction.
 * ”
 *
 *
 *
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        }
        if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }

        if (type.equals("clam")) {
            pizza = new ClamPizza();
        }
        if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
