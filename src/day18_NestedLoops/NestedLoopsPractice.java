package day18_NestedLoops;

import java.util.Scanner;

public class NestedLoopsPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("Enter your age");
            int age = scan.nextInt();

            while (!(age >= 1 && age <= 120)) {
                System.err.println("Invalid entry please re enter your age");
                age = scan.nextInt();
            }
            System.out.println("Would you like to continue?");
            String a = scan.next().toLowerCase();

            while (!(a.equals("yes")||a.equals("no"))){
                System.err.println("Invalid entry please re enter.would you like to continue?");
                a = scan.next().toLowerCase();
            }


            if (a.equals("no")){
                break;
            }
        }
scan.close();


    }
}
