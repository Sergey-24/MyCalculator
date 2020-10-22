public class ArabStringCalculator extends StringCalculator  {

    private int number1;
    private int number2;
    private char delimeter;



    public ArabStringCalculator(String input) {
        super(input);
    }


    String [] values = input.split("[+-/*]");
    @Override
    public int getNumber1() {
        number1 = Integer.parseInt(values[0]);
        return number1;
    }

    @Override
    public int getNumber2() {

        number2 = Integer.parseInt(values[1]);
        return number2;
    }

    @Override
    public char getDelimeter() {

        delimeter = input.charAt(values[0].length());
        return delimeter;
    }
}
