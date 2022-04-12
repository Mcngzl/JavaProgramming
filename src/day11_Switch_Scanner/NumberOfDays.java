package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        int year =2000;
        int number = 9;
        String result ="";

        if(number>=1 && number<=12){
            switch (number){
                case 2:
                   // System.out.println("28 days");
                    result= (year %4 ==0)?"29 days":"28 days";
                    break;
                case 4: case 6 :case 9: case 11:
                    //System.out.println("30 days");
                    result = "30 days";
                    break;
                default:
                    //System.out.println("31 days");
                    result ="31 days";

            }

        }else {
            //System.out.println("Invalid number");
            result ="invalid number";
        }

        System.out.println(result);



    }
}
/*
4. Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( >= 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */