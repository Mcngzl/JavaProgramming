package day04_Variables;

public class PrimitiveIntro {
    public static void main(String[] args) {
        // age:38 years old

        byte age = 38;

        //weight: 160 kilos
        //byte w=160; // we cannot use byte (-128 --127)
        //byte w= -129
        short w= 160; //short -32,768--32,767

        // salary :100000
        //short salary=1000000; 100000 is out of range of short
        int salary=100_000;// int is the preferred data type for integer numbers

        long asset = 3_333_333_333L;

        //tax:0.26
        //int tax= 0.26;
        //float tax= 0.26f;
        double tax =0.26 ;
         // #
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 =35;
        System.out.println("ch2 = " + ch2);


        char ch3 =35000;
        System.out.println("ch3 = " + ch3);


        char ch4 = 15000;
        System.out.println("ch4 = " + ch4);

        char gender ='F';
        char grade ='F';

        char yesno = 'Y';
        // char ch5 ='AB' olmaz single olmali

        boolean isemployed = true;
        boolean ismarried = false;

        boolean result = 100>300;
        System.out.println("isemployed = " + isemployed);
        System.out.println("ismarried = " + ismarried);
        System.out.println("result = " + result);

        String name = "Wooden Spoon";
        String city = "Mclean";
        String state = "Virginia";
        String country ="USA";
        System.out.println("name = " + name);

        String fist_name$ = "Muhtar"; // _ and $ is only allowed




    }



}
