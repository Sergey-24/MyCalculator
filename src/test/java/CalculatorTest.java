import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void calculate() {
        assertEquals(Calculator.calculate(10,10,'+'), 20);
    }
}