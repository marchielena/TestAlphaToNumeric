package TestAplhaToNumeric;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void Test1() {
        assertEquals(App.Convertitore("25abcd26"), "y1234z");
    }

    @Test
    public void Test2() {
        assertEquals(App.Convertitore("18zyz14"), "r262526n");
    }

    @Test
    public void Test3() {
        assertEquals(App.Convertitore("a1b2c3d4"), "1a2b3c4d");
    }

    @Test
    public void Test4() {
        assertEquals(App.Convertitore("5a8p17"), "e1h16q");
    }
}
