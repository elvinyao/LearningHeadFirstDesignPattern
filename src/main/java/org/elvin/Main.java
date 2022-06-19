package org.elvin;

import exp1.Duck;
import exp1.FlayRocketPowered;
import exp1.MallardDuck;
import exp1.ModelDuck;
import exp2.CurrentConditionDisplay;
import exp2.ForecastConditionDisplay;
import exp2.StatisticsConditionDisplay;
import exp2.WeatherData;

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
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsConditionDisplay statisticsConditionDisplay = new StatisticsConditionDisplay(weatherData);
        ForecastConditionDisplay forecastConditionDisplay = new ForecastConditionDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}