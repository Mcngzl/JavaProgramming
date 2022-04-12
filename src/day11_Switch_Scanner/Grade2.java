package day11_Switch_Scanner;

public class Grade2 {
    public static void main(String[] args) {
        char ch= 'C';
        String result ="";


        switch (ch){

            case 'A': case 'B': case  'C':case 'D':
                //System.out.println("Passed");
                result="Passed";
                break;

            case 'F':
                result ="Failed";
            default:
                //System.out.println("Failed");
                result ="Invalid";

        }


        System.out.println(result);




    }
}
/*
if the grade is A or B or c or D =======> "passed"
otherwise ====> "Failed"
 */