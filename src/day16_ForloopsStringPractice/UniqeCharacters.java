package day16_ForloopsStringPractice;

public class UniqeCharacters {
    public static void main(String[] args) {

        String str ="aaaabccccc";

        String result ="";

        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);// ch: each character of str
            if (str.indexOf(ch)==str.lastIndexOf(ch)){//if firs and last index are same
                result +=ch;
            }
        }


        System.out.println(result);








    }
}
/*
3. Write a program that can return the unique characters from a String

			Ex:
				input:
					AABCCD

				output:
					BD

			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique
				  indexOf('A') ==> 0
				  lastIndexOf('A') ==> 1


				  indexOf('B') ==>2
				  lastIndexOf('B') ==> 2





 */