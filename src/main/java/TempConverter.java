public class TempConverter {
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public boolean isExtremeTemperature(double celsius) {
        return celsius < -40 || celsius > 50;
    }

    public static float kelvinToCel(float kel) {
        return (float) (kel - 273.15);
    }

    public static double kelvinToFah(double kel) {
        return Math.round((kel-273.15) * ((double) 9 /5) + 32);
    }

    public static void main(String[] args) {
        TempConverter tempConverter = new TempConverter();
        System.out.println(tempConverter.fahrenheitToCelsius(32));
        System.out.println(tempConverter.celsiusToFahrenheit(0));
        System.out.println(tempConverter.isExtremeTemperature(100));
        System.out.println(kelvinToCel(273.15f));
        System.out.println(kelvinToFah(273.15));
    }
}
