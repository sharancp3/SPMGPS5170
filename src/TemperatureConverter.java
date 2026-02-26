public class TemperatureConverter {

    double convertCelsius(double celsius, String targetScale) {
        if (celsius >= -273.15 && targetScale.equals("F")) {
            return (1.8)*celsius +32;
        }
        else if (celsius >= -273.15 && targetScale.equals("K")) {
            return celsius + 273.15;
        }
        else {
            return -9999;
        }

    };

    double convertFahrenheit (double fahrenheit, String targetScale) {
        if (fahrenheit >= -459.67 && targetScale.equals("C")) {
            return (5/9.)*(fahrenheit -32);
        }
        else if (fahrenheit >= -459.67 && targetScale.equals("K")) {
            return (fahrenheit - 32)*(5/9.) + 273.15;
        }
        else {
            return -9999;
        }
    };

    double convertKelvin (double kelvin, String targetScale) {
        if  (kelvin >= 0 && targetScale.equals("C")) {
            return (kelvin - 273.15);
        }
        else if (kelvin >= 0 && targetScale.equals("F")) {
            return (kelvin - 273.15)*(9/5.) + 32;
        }
        else {
            return -9999;
        }
    };

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        double celsius;
        celsius = 25;
        double fahrenheit;
        fahrenheit = 68;
        double kelvin;
        kelvin = 300;
        System.out.println(celsius + "°C is equivalent to " + converter.convertCelsius(celsius, "F") + "°F and " + converter.convertCelsius(celsius, "K") + "K");
        System.out.println(fahrenheit + "°F is equivalent to " + converter.convertFahrenheit(fahrenheit, "C") + "°C and " + converter.convertFahrenheit(fahrenheit, "K") + "K");
        System.out.println(kelvin + "K is equivalent to " + converter.convertKelvin(kelvin, "C") + "°C and " + converter.convertKelvin(kelvin, "F") + "°F");


    }
}
