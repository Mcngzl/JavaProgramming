package day17_While_Dowhile;

public class Frequancyofcharacter {
    public static void main(String[] args) {
        String str = "AAABBBCAAAAAAAAAAAAA";
        char ch='A';

        int frequency= 0;

        for (int i = 0; i < str.length(); i++) {//i: index of str
            char eachChar =str.charAt(i);//eachChar : each character of str

            if (ch==eachChar){// if given ch is macthinh with the character ,then ch is appeared in the string
                frequency++;

            }


        }

        System.out.println(frequency);





    }

}
/*
1. Write a program that can return the frequency of a char from a String

			Ex:
				str = "AAABBBC"
				ch = 'A'

			Output:
				3
 */