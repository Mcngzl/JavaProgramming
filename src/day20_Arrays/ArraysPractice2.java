package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {

        char[] letters = new char[26];
       /*
        letters[0] = 'A';
        letters[1] = 'B';

        */
        /*
        for (char i = 'A',j=0; i <= 'Z' && j<letters.length ; i++,j++) {
            letters[j]=i;
        }

         */

        /*for (int i = 0,j='A'; i <letters.length-1 && j<='z' ; i++,j++) {
            letters[i]= (char) j;
        }

         */

        char ch = 'A';
        for (int i = 0; i <letters.length ; i++) {
            letters[i] = ch;
            ch++;
        }

        System.out.println(Arrays.toString(letters));

        System.out.println("----------------------");

        char[] letters2 = new char[26];//A~Z
        char ch1 = 'Z';
        for (int j = 0; j <letters2.length ; j++) {
            letters2[j] = ch1;
            ch1--;
        }
        System.out.println(Arrays.toString(letters2));

    }
}
