import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Converter {

    private static String romanNumber;



    public Converter(String romanNumber) {
        this.romanNumber = romanNumber;
    }


    public static int romanToArab(String romanNumber) {
        RomanToArab roman = RomanToArab.valueOf(romanNumber);
        return roman.getNumber();
    }

    public static String arabToRoman(int arabic) {

        List<RomanToArab> literas = Arrays.asList(RomanToArab.values());
        Collections.reverse(literas);

        int rest = arabic;

        StringBuilder romanindex = new StringBuilder();

        for (RomanToArab literal : literas){
            while (rest >= literal.getNumber()){
                romanindex.append(literal);
                rest -= literal.getNumber();
            }


        }
        return romanindex.toString();
    }

}
