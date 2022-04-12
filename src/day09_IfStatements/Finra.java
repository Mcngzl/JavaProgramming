package day09_IfStatements;

public class Finra {
    public static void main(String[] args) {
        int number =3;
        String value;
        boolean a = number%3==0;
        boolean b = number%5==0;
        boolean c = number%3==0 && number%5==0;
        if (a&&b){
            value="FINRA";
        }else if (a&& !b){
            value="FIN";
        }else{
           value= "RA";
        }
        System.out.println(value);
    }
}
/*
3. Create a class called FINRA, Write a function which prints out the number. but for number which is a multiple of 3,
print "FIN" instead of the number and for number which is a multiple of 5, print "RA" instead of the number.
and for number which is a multiple of both 3 and 5, print "FINRA" instead of the number.
            ex:
                number = 3
            output:
                      FIN

                number = 10
            output:
                RA

                number = 15
            output:
                FINRA


 */