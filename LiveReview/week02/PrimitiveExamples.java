package week02;

public class PrimitiveExamples {
    public static void main(String[] args) {
        /*
        Datatype variableName = Value ;Declare and inintialize at the same line
        data variable Name;
        variableName=Value;
        Datatype variableNameOne,variableNametwo
         */
        byte num1; // Declaring a variable
        num1= 123; //initializing a variable
        num1= 121; // re-assign a value

        short num2 = 12345; //Declare and initializie at the same line

        int distance = 1000000000; //
        long distanceMore =3_000_000_000l; // l we have to use" l or L// "
        long distanceShorter =1_000_000_000; // if it does not pass the limit then we dont have to use l or L

        long az= 1;
        float rate =1000f;
        double Dnumber =123.5;
        System.out.println("------Casting---------------");

        System.out.println("Before Swapping Values");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        // you ,ight need to swap or reasign
        num2=num1;// i am assigning num1 to num2
        // implicit casting ,widening,done by the compiler
        System.out.println("after swapping");
        System.out.println("num2 = " + num2);


        System.out.println("explicit casting");
        num2 =(short)distance; // narrowing done manually ,possiblitiy of loosing data
        System.out.println("num2 = " + num2);// concatination


        System.out.println("Explicit casting of floating points");
        short rateTwo = (short) rate;
        System.out.println("rateTwo = " + rateTwo);




    }
}
