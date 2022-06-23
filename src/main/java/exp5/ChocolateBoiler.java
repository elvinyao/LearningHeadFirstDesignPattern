package exp5;

/**
 * “The Singleton Pattern ensures you have at most one instance of a class in your application.
 * The Singleton Pattern also provides a global access point to that instance.
 * Java’s implementation of the Singleton Pattern makes use of a private constructor, a static method combined with a static variable.
 * Examine your performance and resource constraints and carefully choose an appropriate Singleton implementation for multithreaded applications
 * (and we should consider all applications multithreaded!).
 * Beware of the double-checked locking implementation; it isn’t thread safe in versions before Java 5.
 * Be careful if you are using multiple class loaders; this could defeat the Singleton implementation and result in multiple instances.
 * You can use Java’s enums to simplify your Singleton implementation.”
 * <p>
 * 单例模式的线程安全
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    public static ChocolateBoiler chocolateBoiler;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (chocolateBoiler == null) {
            chocolateBoiler = new ChocolateBoiler();
        }
        return chocolateBoiler;


    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    private boolean isEmpty() {
        return empty;
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    private boolean isBoiled() {
        return boiled;
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

}
