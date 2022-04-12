package day01_JavaIntro;

import day24_Custommethods_Return.ReturnMethodIntro;
import day24_Custommethods_Return.ReturnMethodPractice4;
import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {

        String str ="aaaaaaaaaaaabbbbbbbbbcccccccccccc";

        String str1 =ReturnMethodPractice4.removeDuplicates(str);
        System.out.println(str1);

        String str2= "WoodenSpoon";
        StringUtility.printEachChar(str2);
        String name ="Java Programming";

        String name1 =ReturnMethodIntro.reverse(name);
        System.out.println(name1);






    }





}
