package day12_Scanner;

import java.util.Scanner;

public class ScannerPractise3_NextLine {
    public static void main(String[] args) {

        //123enter

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name:");
        String fullName = input.nextLine();//wooden spoonEnter

        System.out.println("Enter your Programming Language:");
        String programming = input.nextLine();//Java programming LanguageEnter

        System.out.println("Enter your age:");
        int age =input.nextInt();//24

        input.nextLine();//

        System.out.println("Enter uor school name");
        String schoolName =input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);


    }
}
