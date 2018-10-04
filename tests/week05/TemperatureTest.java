package week05;

import org.junit.Test;
import static org.junit.Assert.*;

import static week05.Temperature.*;

public class TemperatureTest
{
    @Test
    public void test_fahrenheit_to_celsius_1()
    {
        double input = 32;
        double expected = 0;

        double actual = farenheit2Celcius(input);

        assertEquals(expected, actual, 1e-3);
        // Assert.assertEquals(1,1);
    }

    @Test
    public void test_fahrenheit_to_celsius_2()
    {
        double input = 212;
        double expected = 100;

        double actual = farenheit2Celcius(input);

        assertEquals(expected, actual, 1e-3);
    }

    @Test
    public void test_celsius_to_fahrenheit_1()
    {
        assertEquals(212, celcius2Farenheit(100), 1e-3);
    }

    @Test
    public void test_celsius_to_fahrenheit_2()
    {
        assertEquals(32, celcius2Farenheit(0), 1e-3);
    }
}