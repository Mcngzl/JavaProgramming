package week02;

import java.util.Scanner;

public class UserInputIntro {
    public static void main(String[] args) {

        String name = "";// hard coded way

        //output goes to console ----- print or println
        System.out.println("output");

        //How cam i receive input for my javaa class

        // 1.create your scanner object(object name can be anything )
        Scanner input = new Scanner(System.in);// you dont see anything

        //2.prompt the user for putting input
        System.out.println("Put your name ;");// this printed out to console

        //3. get the input

        name =input.next();//reads the data from consoleand assigns the value to my variable

        //4. use the value that i read
        System.out.println("name = " + name);

        //step 1 and 3 are MUST ,but 2 and 4 depends on the situation
        // we need to import scanner class from java utilities
        //import java.util.Scanner; yu put this statement at the top of yur page before class (automatic)

        //input.nextDouble()=double data type // input.nextInt() = integer data type
        //nextLine() is used for more than one words



    }
}
