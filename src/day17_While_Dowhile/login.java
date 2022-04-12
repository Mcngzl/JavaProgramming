package day17_While_Dowhile;

import javax.swing.*;
import java.util.Scanner;

public class login {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username:");
        String u = scan.next();

        System.out.println("Enter your username:");
        String p = scan.next();

        if (u.equals("Cydeo") && p.equals("Cydeo123")) {//if creditantials correct
            System.out.println("Logged in");
        } else {//if creditentials not correct

            int attempts = 3;
            while (!(u.equals("Cydeo") && p.equals("Cydeo123")) && attempts > 0) {
                if (attempts==1){
                    System.out.println("This is your last chance");
                }
                System.out.println("Incorrect username or password, please re enter");
                System.out.println("enter your username");
                u = scan.next();

                System.out.println("Enter your password");
                p = scan.next();
                attempts--;
            }
            if (u.equals("Cydeo") && p.equals("Cydeo123")) {
                System.out.println("Logged in");
            }else{
                System.out.println("your account is locked");
            }
        }

        scan.close();


    }
}
