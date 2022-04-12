package day09_IfStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class campusTime {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter hour");
        int hour = scan.nextInt();

        if (hour>=8 && hour<=11){
            System.out.println("open");
        }else{
            System.out.println("closed");
        }
    }
}
/*
1.  Create a class called CampusTime, an integer variable named time is given with a number between 1~24 has been initialized,
write a program that can find out if the campus is open or not. Campus is open from 8 am(8) to 11 pm
If user enters a time within the open time they should see message: “open”
but if the time entered is outside of operating hours they should see: “ closed”

 */