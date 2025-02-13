public class TemperatureConverter {

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public boolean isExtremeTemperature(double temperatureInCelsius) {
        if(temperatureInCelsius <-40 || temperatureInCelsius > 50)
            return true;
        return false;
    }
}
