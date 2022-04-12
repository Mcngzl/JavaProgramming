package week06;

public class BasicLoopExamples {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i += 10) {
            System.out.print(i + " ");
        }
        System.out.println();
        int z = 0;
        for (; z <= 100; ) {
            if (z % 10 == 0) {
                System.out.print(z + " ");
            }
            z++;
            // z+=10;  // iteration
        }

        System.out.println("=======================================================");
/*Question-2:

        Write a program that
        displays all odd numbers between 3-130
        in the same line
         */

        for (int i = 3; i < 130 ; i += 2){
            System.out.print(i+" ");
        }
        System.out.println("============================================");
        int total=0;

        for (int i = 5; i <=50 ; i++) {
            if(i%2==0)
                total++;

        }
        System.out.println("total is: "+total);

    }}
