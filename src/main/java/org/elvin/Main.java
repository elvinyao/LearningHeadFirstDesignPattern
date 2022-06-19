package org.elvin;

import exp1.Duck;
import exp1.FlayRocketPowered;
import exp1.MallardDuck;
import exp1.ModelDuck;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlayRocketPowered());
        model.performFly();
    }
}