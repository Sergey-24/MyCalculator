public class RomanStringCalculator extends StringCalculator {
    private  int number1;
    private  int number2;
    private  char delimeter;


    public RomanStringCalculator(String input) {
        super(input);
    }


    String [] values = input.split("[+-/*]");

    public int getNumber1() {
        number1 = Converter.romanToArab(values[0]);
        return number1;
    }

    public int getNumber2() {

        number2 = Converter.romanToArab(values[1]);
        return number2;
    }

    public char getDelimeter() {

        delimeter = input.charAt(values[0].length());
        return delimeter;
    }


}