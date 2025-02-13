import static org.junit.jupiter.api.Assertions.*;


class TemperatureConverterTest {
    TemperatureConverter temperatureConverter = new TemperatureConverter();
    @org.junit.jupiter.api.Test
    void testFahrenheitToCelsius() {
        assertEquals(0, temperatureConverter.fahrenheitToCelsius(32), "This should be 0 celsius" );
        assertEquals(-40, temperatureConverter.fahrenheitToCelsius(-40), "This should be -40 celsius" );
        assertEquals(50, temperatureConverter.fahrenheitToCelsius(122), "This should be 0 celsius" );
    }

    @org.junit.jupiter.api.Test
    void testCelsiusToFahrenheit() {
        assertEquals(122, temperatureConverter.celsiusToFahrenheit(50), "This should be 122 fahrenheit" );
        assertEquals(89.6, temperatureConverter.celsiusToFahrenheit(32), "This should be 32 fahrenheit" );
        assertEquals(5, temperatureConverter.celsiusToFahrenheit(-15), "This should be 5 fahrenheit" );
    }

    @org.junit.jupiter.api.Test
    void testIsExtremeTemperature() {
        assertTrue(temperatureConverter.isExtremeTemperature(51), "This is extreme temperature" );
        assertTrue(temperatureConverter.isExtremeTemperature(-60), "This is extreme temperature" );
        assertFalse(temperatureConverter.isExtremeTemperature(40), "This is not extreme temperature" );
    }
}