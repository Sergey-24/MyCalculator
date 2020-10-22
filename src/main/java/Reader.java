import java.util.Scanner;

public class Reader {


    public static String read() {
        String line = null;



        Scanner scanner = new Scanner(System.in);
            if (scanner.hasNext()){
               line = scanner.nextLine();

            }
            else {
                scanner.next();
            }


                return line;


          
    }


}
