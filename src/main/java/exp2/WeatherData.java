package exp2;

import java.util.ArrayList;
import java.util.List;

/**
 * Observer Pattern
 * “The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state,
 * all of its dependents are notified and updated automatically.”
 * Design Principle
 * Strive for loosely coupled designs between objects that interact.
 * <p>
 * “The Observer Pattern defines a one-to-many relationship between objects.
 * Subjects update Observers using a common interface.
 * Observers of any concrete type can participate in the pattern as long as they implement the Observer interface.
 * Observers are loosely coupled in that the Subject knows nothing about them, other than that they implement the Observer interface.
 * You can push or pull data from the Subject when using the pattern (pull is considered more “correct”).
 * Swing makes heavy use of the Observer Pattern, as do many GUI frameworks.
 * You’ll also find the pattern in many other places, including RxJava, JavaBeans, and RMI, as well as in other language frameworks, like Cocoa, Swift, and JavaScript events.
 * The Observer Pattern is related to the Publish/Subscribe Pattern, which is for more complex situations with multiple Subjects and/or multiple message types.
 * The Observer Pattern is a commonly used pattern, and we’ll see it again when we learn about Model-View-Controller.”
 *
 * “The Swing library
 * You probably already know that Swing is Java’s GUI toolkit for user interfaces. One of the most basic components of that toolkit is the JButton class. If you look up JButton’s superclass, AbstractButton, you’ll find that it has a lot of add/remove listener methods. These methods allow you to add and remove observers—or, as they are called in Swing, listeners—to listen for various types of events that occur on the Swing component. For instance, an ActionListener lets you “listen in” on any types of actions that might occur on a button, like a button press. You’ll find various types of listeners all over the Swing API.”
 *
 * Excerpt From
 * Head First Design Patterns, 2nd Edition
 * Eric Freeman
 * This material may be protected by copyright.
 */
public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }


    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temp, humidity, pressure);
        }
    }


    public void measurementsChanged() {
        notifyObservers();

    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();

    }
}


