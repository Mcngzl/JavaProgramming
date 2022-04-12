package day12_Scanner;

import java.util.Scanner;

public class ShippinAddress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter your full name");
        String fullname = scan.nextLine();

        System.out.println("enter your building number");
        int buildingnumber = scan.nextInt();

        scan.nextLine();//  <<=====

        System.out.println("enter your street name");
        String streetname = scan.nextLine();

        System.out.println("enter your city name:");
        String cityname = scan.nextLine();

        System.out.println("enter your state");
        String state = scan.next();

        System.out.println("enter your zip code:");
        String zipcode = scan.next();

        scan.nextLine();

        System.out.println("enter your country name");
        String country = scan.nextLine();



        scan.close();
        System.out.println(fullname+"\n"+buildingnumber+streetname+"\n"+cityname+"\\"+state+"\n"+country+"\\"+zipcode);
    }
}
/*
1.enter your full name          nextLine
2.enter your building number    next
3.enter your street name        nextLine
4.en yo city name               nextLine
5.en yo state                   next
6.e u zip code                  next


 */