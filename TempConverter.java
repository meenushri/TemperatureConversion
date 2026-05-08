import java.util.Scanner;

public class TempConverter {

    // Celsius to Fahrenheit
    public double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    // Celsius to Kelvin
    public double celsiusToKelvin(double c) {
        return c + 273.15;
    }

    // Fahrenheit to Celsius
    public double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    // Fahrenheit to Kelvin
    public double fahrenheitToKelvin(double f) {
        return (f - 32) * 5 / 9 + 273.15;
    }

    // Kelvin to Celsius
    public double kelvinToCelsius(double k) {
        return k - 273.15;
    }

    // Kelvin to Fahrenheit
    public double kelvinToFahrenheit(double k) {
        return (k - 273.15) * 9 / 5 + 32;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TempConverter tc = new TempConverter();

        System.out.println("==== Temperature Converter ====");
        System.out.println("1. Celsius to Fahrenheit & Kelvin");
        System.out.println("2. Fahrenheit to Celsius & Kelvin");
        System.out.println("3. Kelvin to Celsius & Fahrenheit");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                double c = sc.nextDouble();
                System.out.println(c + " C = " + tc.celsiusToFahrenheit(c) + " F");
                System.out.println(c + " C = " + tc.celsiusToKelvin(c) + " K");
                break;

            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                double f = sc.nextDouble();
                System.out.println(f + " F = " + tc.fahrenheitToCelsius(f) + " C");
                System.out.println(f + " F = " + tc.fahrenheitToKelvin(f) + " K");
                break;

            case 3:
                System.out.print("Enter temperature in Kelvin: ");
                double k = sc.nextDouble();
                System.out.println(k + " K = " + tc.kelvinToCelsius(k) + " C");
                System.out.println(k + " K = " + tc.kelvinToFahrenheit(k) + " F");
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}