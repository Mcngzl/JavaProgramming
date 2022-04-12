package replit;

import java.util.Scanner;

public class VendingMachine {

            public static void main(String[] args) {
                //ENTER CODE HERE

                Scanner input = new Scanner(System.in);

                System.out.println("Enter cents:");

                int cents = input.nextInt();
                boolean isTrue = (cents>0 && cents<100);

                int quarters = cents/25;
                int dimes   = (cents-quarters*25)/10;
                int nickels =(cents-(quarters*25+dimes*10))/5;
                int pennies =(cents-(quarters*25+dimes*10+nickels*5))/1;

                if (isTrue) {
                    System.out.println("Your change is "+quarters+" quarters, "+dimes+" dimes,"+nickels+" nickels, and "+pennies+" pennies");

                }else {
                    System.out.println("Invalid cents amount");

                }













            }
}
