package two;

import java.util.Scanner;

public class HelloWorldName {
    public static void  main(String[] args){
         Scanner rr = new Scanner(System.in);
         double ss = rr.nextDouble();
         String theName = getValueFromUser("enter your name:");
         System.out.print("Hello " + theName);

    }

    public static String getValueFromUser(String theText)
    {
        String theName;
        Scanner reader;
        reader = new Scanner(System.in);
        System.out.println(theText);
        theName = reader.nextLine();
        reader.close();
        return  theName;
    }
}
