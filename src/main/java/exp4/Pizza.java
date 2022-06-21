package exp4;

import java.util.ArrayList;
import java.util.List;

/**
 * “The Factory Method Pattern defines an interface for creating an object, but lets subclasses decide which class to instantiate.
 * Factory Method lets a class defer instantiation to subclasses.”
 * <p>
 * Dependency Inversion Principle
 * Depend upon abstractions. Do not depend upon concrete classes.
 * “At first, this principle sounds a lot like “Program to an interface, not an implementation,” right?
 * It is similar; however, the Dependency Inversion Principle makes an even stronger statement about abstraction.
 * It suggests that our high-level components should not depend on our low-level components; rather, they should both depend on abstractions.
 * ”
 * <p>
 * “No variable should hold a reference to a concrete class.
 * Note
 * If you use new, you’ll be holding a reference to a concrete class. Use a factory to get around that!
 * <p>
 * No class should derive from a concrete class.
 * Note
 * If you derive from a concrete class, you’re depending on a concrete class. Derive from an abstraction, like an interface or an abstract class.
 * <p>
 * No method should override an implemented method of any of its base classes.
 */
public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Pepperoni pepperoni;
    Veggies veggies[];
    Clams clam;
    List<String> toppings = new ArrayList<String>();


    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 min at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return ("This Pizza is " + name);
    }
}

