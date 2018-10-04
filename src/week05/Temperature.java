package week05;

class Temperature
{
    static double farenheit2Celcius(double temperature)
    {
        return (temperature - 32) * 5 / 9;
    }

    static double celcius2Farenheit(double temperature)
    {
        return temperature * 9 /5 + 32;
    }
}