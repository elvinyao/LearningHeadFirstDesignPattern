package org.elvin;

import exp1.Duck;
import exp1.FlayRocketPowered;
import exp1.MallardDuck;
import exp1.ModelDuck;
import exp2.CurrentConditionDisplay;
import exp2.ForecastConditionDisplay;
import exp2.StatisticsConditionDisplay;
import exp2.WeatherData;
import exp3.*;
import exp4.ChicagoPizzaStore;
import exp4.NYPizzaStore;
import exp4.Pizza;
import exp4.PizzaStore;

public class Main {
    public static void main(String[] args) {
        /*
        EXP01 Strategy Pattern
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlayRocketPowered());
        model.performFly();*/

        //EXP02 Observer Pattern
        /*WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsConditionDisplay statisticsConditionDisplay = new StatisticsConditionDisplay(weatherData);
        ForecastConditionDisplay forecastConditionDisplay = new ForecastConditionDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);*/

        //EXP03 Decorator Pattern
        /*Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());
        Beverage beverage2 = new DarkRoast();

        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $ " + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $ " + beverage3.cost());*/

        //EXP04 Factory Method Pattern
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");


    }
}