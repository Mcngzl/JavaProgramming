package day15_ForLoops.day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {

        String[] students = {"Elif","Sinem","Gunay","Cihad","David","James","Aaron"};
        String[] ealyBirds = Arrays.copyOf(students,3);
        String[] ealyBirds1 = Arrays.copyOf(students,15);

        System.out.println(Arrays.toString(ealyBirds));

        System.out.println(Arrays.toString(ealyBirds1));//null diye doldurur klana elemanlari


        int[] numbers ={1,2,3,4,5,6,7,8,9};

        numbers= Arrays.copyOf(numbers,5);//artik numbers bu oldu
        System.out.println(Arrays.toString(numbers));//ar

        System.out.println("-----------------------------------------------------------------------");

        char[] ch1 = {'A','B','C','D','E','F','G','H','I'};
        char[] ch2 =Arrays.copyOfRange(ch1,2,6);//2 den sonra 6 dan oncesini verir
        char[] ch3 =Arrays.copyOfRange(ch1,2-1,6+1);
        System.out.println(Arrays.toString(ch2));


        int[] scores = {10,20,30,40,50,60,70,80,90,100};
        //index          0  1  2
        int[] result = Arrays.copyOfRange(scores,3,7);
        System.out.println(Arrays.toString(result));
        int[] result2 = Arrays.copyOfRange(scores,3,scores.length-1);

        System.out.println(Arrays.toString(result2));


    }
}
