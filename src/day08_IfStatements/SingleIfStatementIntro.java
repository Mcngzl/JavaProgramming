package day08_IfStatements;

public class SingleIfStatementIntro {
    public static void main(String[] args) {

        int number =101;
        /*

        System.out.println("Odd number");
        System.out.println("Even number");

         */

        boolean evennumber = number %2==0;
        boolean oddnumber = ! evennumber;// not evennumber

        if (evennumber){
            System.out.println(number+" is even number");
        }
        if (oddnumber){//not even number
            System.out.println(number+" is odd number");
        }

        System.out.println("-------------------------------------------------------------------");

        int n = 200;
        //positive
        if (n>0){
            System.out.println(n+" is positive");
        }
        // negative
        if (n<0){
            System.out.println(n+" is negative");
        }
        // zero
        if (n==0){
            System.out.println(n+" is zero");
        }



    }
}
