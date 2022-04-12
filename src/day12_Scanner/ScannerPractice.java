package day12_Scanner;
//import java.util.*;//(*)wild import :imports everything from the package

import java.util.Scanner; // regular import :imports one class

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 1 to 7");

        int num =scan.nextInt();

        String result ="";// temporarily value

        if (num>=1 && num<=7){//7 option
            result=(num==1)?"Monday" :(num==2)?"Tuesday" :(num==3)?"Wednesday" :(num==4)?"donderdag":(num==5)?"friday":
                    (num==6)?"saturday":"sunday";




        }else {
            result="Invalid number";
        }
        System.out.println(result);
        scan.close();

    }
}
