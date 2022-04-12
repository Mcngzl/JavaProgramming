package day25_CustomMtehods_Overloading;

import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {

        String str = "Java Programming Language";
        StringUtility.printEachChar(str);

        System.out.println("----------------------------");
        String s1 = "Wooden Spoon";

        String reverse = StringUtility.reverse(s1);
        System.out.println(reverse);

        System.out.println("--------------------------------------");

        String word = "civic";
        boolean palindrome = StringUtility.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);

        System.out.println("-------------------------------");

        String[] names = {"Anna", "Java", "Phyton", "Racecar"};

        int count = 0;
        for (String each : names) {
            if (StringUtility.isPalindrome(each)) {
                count++;
            }

        }
        System.out.println(count);


        System.out.println("-------------------------");
        String s2 ="aaaaaaaaabbbbbbbcccccc";

        String nondup =StringUtility.removeDuplicates(s2);
        System.out.println(nondup);





    }
}
