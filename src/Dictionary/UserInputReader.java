package Dictionary;

import java.util.Scanner;

public class UserInputReader {

    public String inputReader(String message) {
        // todo  you must check if user enter empty line
        Scanner Reader = new Scanner(System.in);
        System.out.print(message);
        String result = Reader.nextLine();
        return result;
    }

}
