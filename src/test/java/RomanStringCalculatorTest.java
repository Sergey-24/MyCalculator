import org.junit.Test;

import static org.junit.Assert.*;

public class RomanStringCalculatorTest {
    RomanStringCalculator romanStringCalculator = new RomanStringCalculator("II+IV");

    @Test
    public void getNumber1() {
        assertEquals(romanStringCalculator.getNumber1(),2);
    }

    @Test
    public void getNumber2() {
        assertEquals(romanStringCalculator.getNumber2(),4);
    }

    @Test
    public void getDelimeter() {
        assertEquals(romanStringCalculator.getDelimeter(),'+');
    }
}