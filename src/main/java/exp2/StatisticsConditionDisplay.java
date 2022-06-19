package exp2;

public class StatisticsConditionDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private WeatherData weatherData;

    public StatisticsConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("StatisticsConditionDisplay: Current conditions: " + temp + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }
}
