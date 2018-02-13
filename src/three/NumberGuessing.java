package three;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {

        public static void  main(String[] args){

            Random randomGenerator = new Random();
            int randomInt = randomGenerator.nextInt(200);

            System.out.println("Please try to guesse Between 0 and 200");

            int gessevalue;
            int numTries = 0;

            while (true){
                numTries++;
                gessevalue = getIntValue();

                if (gessevalue == randomInt){
                    System.out.println("You are Win ");
                    System.out.print("You Try until guesse the Number:");
                    System.out.println(numTries);
                    break;
                }
                if (gessevalue> randomInt) {
                    System.out.println("the guessed number is below the randomized one");
                }
                else {
                    System.out.println("the guessed number is above the randomized one");
                }
            }

        }


        public static int getIntValue()
        {
            int gessevalue;
            Scanner reader;
            reader = new Scanner(System.in);
            gessevalue = reader.nextInt();
            return  gessevalue;
        }
}
