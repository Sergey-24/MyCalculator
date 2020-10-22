import org.junit.Test;

import static org.junit.Assert.*;

public class ArabStringCalculatorTest {
    StringCalculator stringCalculator2 = new ArabStringCalculator("2+3");

    @Test
    public void getNumber1() {

        //  assertEquals(stringCalculator.getNumber1(),9);
        assertEquals(stringCalculator2.getNumber1(), 2);
    }

    @Test
    public void getNumber2() {

        //   assertEquals(stringCalculator.getNumber2(),10);
        assertEquals(stringCalculator2.getNumber2(),3);

    }

    @Test
    public void getDelimeter() {
        assertEquals(stringCalculator2.getDelimeter(), '+');

    }
    
}