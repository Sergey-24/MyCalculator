



public class Main {
   static int result;
   static boolean flag = false;

   static StringCalculator stringCalculator;
   static  int first;
   static int second;







    public static void main(String[] args) throws NumberFormatException, FormatExeption {



        while (true) {

            String line = Reader.read();


            String[] values = line.split("[+-/*]");
            try {
                first = Integer.parseInt(values[0]);
                second = Integer.parseInt(values[1]);
                if (first < 1 || first > 10 || second < 1 || second > 10) {
                    System.out.println("Референсные значения : Не обнаружено!");
                    System.exit(0);
                }
                stringCalculator = new ArabStringCalculator(line);
            } catch (Exception e) {

                try {
                    first = Converter.romanToArab(values[0]);
                    second = Converter.romanToArab(values[1]);
                    flag = true;
                } catch (Exception e1) {
                    System.out.println("Неверный формат ввода");
                    System.exit(0);
                }

                    if (first < 1 || first > 10 || second < 1 || second > 10) {
                        System.out.println("Референсные значения : Не обнаружено!");
                        System.exit(0);
                    }
                    if (flag) {
                        stringCalculator = new RomanStringCalculator(line);
                    }
                }

            result = Calculator.calculate(stringCalculator.getNumber1(),stringCalculator.getNumber2(),stringCalculator.getDelimeter());
            if (flag) {
                System.out.println(Converter.arabToRoman(result));
            } else {
                System.out.println(result);
            }
        }
    }
}
