import org.junit.Test;
import static org.junit.Assert.*;

public class TempConverterTest {

    TempConverter tc = new TempConverter();

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(212.0, tc.celsiusToFahrenheit(100), 0.01);
    }

    @Test
    public void testCelsiusToKelvin() {
        assertEquals(373.15, tc.celsiusToKelvin(100), 0.01);
    }

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(100.0, tc.fahrenheitToCelsius(212), 0.01);
    }

    @Test
    public void testFahrenheitToKelvin() {
        assertEquals(373.15, tc.fahrenheitToKelvin(212), 0.01);
    }

    @Test
    public void testKelvinToCelsius() {
        assertEquals(100.0, tc.kelvinToCelsius(373.15), 0.01);
    }

    @Test
    public void testKelvinToFahrenheit() {
        assertEquals(212.0, tc.kelvinToFahrenheit(373.15), 0.01);
    }
}