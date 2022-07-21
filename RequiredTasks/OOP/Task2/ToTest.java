package RequiredTasks.OOP.Task2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ToTest {
    ToFahrenheit converterF = new ToFahrenheit();
    ToKelvin converterK = new ToKelvin();

    @Test
    public void test1() {
        assertEquals(32, converterF.getConvertedValue(0), 0);
    }
    @Test
    public void test2() {
        assertEquals(273.15, converterK.getConvertedValue(0), 0);
    }
}