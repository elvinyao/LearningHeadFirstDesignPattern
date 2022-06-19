package exp1;

/*
 * Head First Design Patterns
 * Design Principle: Identify the aspects of your application that vary and separate them from what stays the same.
 * Design Principle: Program to an interface , not an implementation.
 * Design Principle: Favor composition over inheritance.
 * 01: Strategy Pattern
 * “The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently
 * from clients that use it.”
 *
 * “Knowing the OO basics does not make you a good OO designer.
Good OO designs are reusable, extensible, and maintainable.
Patterns show you how to build systems with good OO design qualities.
Patterns are proven object-oriented experience.
Patterns don’t give you code, they give you general solutions to design problems. You apply them to your specific application.
Patterns aren’t invented, they are discovered.
Most patterns and principles address issues of change in software.
Most patterns allow some part of a system to vary independently of all other parts.
We often try to take what varies in a system and encapsulate it.
Patterns provide a shared language that can maximize the value of your communication with other developers.”

 * */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float,even decoys!");
    }
}

