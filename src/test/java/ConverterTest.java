import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void romanToArab() {
        assertEquals(Converter.romanToArab("I"), 1);
        assertEquals(Converter.romanToArab("X"), 10);
        assertEquals(Converter.romanToArab("IX"), 9);
        assertEquals(Converter.romanToArab("VI"), 6);
        assertEquals(Converter.romanToArab("IV"), 4);
    }

    @Test
    public void arabToRoman_1_to_I() {

        assertEquals(Converter.arabToRoman(1), "I");

    }

    @Test
    public void arabToRoman_2_to_II() {

        assertEquals(Converter.arabToRoman(2), "II");

    }

    @Test
    public void arabToRoman_3_to_III() {

        assertEquals(Converter.arabToRoman(3), "III");

    }

    @Test
    public void arabToRoman_XX_to_20() {
        assertEquals(Converter.arabToRoman(20), "XX");
    }
    @Test
    public void arabToRoman_XXX_to_30() {
        assertEquals(Converter.arabToRoman(30), "XXX");
    }
    @Test
    public void arabToRoman_V_to_5() {
        assertEquals(Converter.arabToRoman(5), "V");
    }
    @Test
    public void arabToRoman_IV_to_4() {
        assertEquals(Converter.arabToRoman(4), "IV");
    }
    @Test
    public void arabToRoman_XIX_to_19() {
        assertEquals(Converter.arabToRoman(19), "XIX");
    }
    @Test
    public void arabToRoman_XL_to_40() {
        assertEquals(Converter.arabToRoman(40), "XL");
    }
    @Test
    public void arabToRoman_L_to_50() {
        assertEquals(Converter.arabToRoman(50), "L");
    }


    @Test
    public void arabToRoman_VI_to_6() {
        assertEquals(Converter.arabToRoman(6), "VI");
    }
    @Test
    public void arabToRoman_С_to_100() {
        assertEquals(Converter.arabToRoman(100), "C");
    }

}