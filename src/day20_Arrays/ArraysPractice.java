package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {

        //store teh elements : 10,20,50,70
        int[] numbers = {10,20,50,70};

        System.out.println(Arrays.toString(numbers));
        System.out.println("---------------------------------------");

        //create avariable that can contain scores
        int[] scores = new int[5];
        scores[1] = 85;
        scores[scores.length-1] = 95;
        scores[3] =75;
        scores[0] = 65;
        scores[2] = 55;
        System.out.println(Arrays.toString(scores));

        System.out.println("-----------------------------------------------");

        String[]months = {"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};

        //System.out.println(months[4]);

        for (int i = 0; i < months.length ; i++) {
            System.out.println(months[i]);
        }
        System.out.println("-----------------------------");

        for (int i = months.length-1; i >=0 ; i--) {
            System.out.println(months[i]);
        }






    }
}
