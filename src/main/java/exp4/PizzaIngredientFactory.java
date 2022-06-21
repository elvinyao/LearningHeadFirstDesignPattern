package exp4;

/**
 * “Abstract Factory Pattern defined
 * We’re adding yet another factory pattern to our pattern family, one that lets us create families of products.
 * Let’s check out the official definition for this pattern:
 * Note
 * The Abstract Factory Pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.”
 *
 *“All factories encapsulate object creation.
 * Simple Factory, while not a bona fide design pattern, is a simple way to decouple your clients from concrete classes.
 * Factory Method relies on inheritance: object creation is delegated to subclasses, which implement the factory method to create objects.
 * Abstract Factory relies on object composition: object creation is implemented in methods exposed in the factory interface.
 * All factory patterns promote loose coupling by reducing the dependency of your application on concrete classes.
 * The intent of Factory Method is to allow a class to defer instantiation to its subclasses.
 * The intent of Abstract Factory is to create families of related objects without having to depend on their concrete classes.
 * The Dependency Inversion Principle guides us to avoid dependencies on concrete types and to strive for abstractions.
 * Factories are a powerful technique for coding to abstractions, not concrete classes.”
 *
 */
public interface PizzaIngredientFactory {
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();
}

