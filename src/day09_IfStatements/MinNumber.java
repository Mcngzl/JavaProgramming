package day09_IfStatements;

public class MinNumber {
    public static void main(String[] args) {

        int    n1 = 100,
                n2= 100;

        boolean n1IsmMin = n1<n2;
        boolean n2IsMin = n2<n1;
        boolean equal = n1==n2;

        if (n1IsmMin){//if n1 is the min number
            System.out.println(n1+" is the min number");
        }
        if (n2IsMin){// if n2 is the min number
            System.out.println(n2+" is the min number");
        }
        if (equal){// if n1 equals to n2
            System.out.println("Equal");

        }

       /* if (n1<n2){

            System.out.println(n1+"is the min number");
        }

        */






    }
}
