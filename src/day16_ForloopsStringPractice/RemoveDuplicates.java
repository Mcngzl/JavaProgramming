package day16_ForloopsStringPractice;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "aabbaacc";

        String result = ""; //
        for (int i = 0; i <= str.length() - 1; i++) {//i = represents the all the index numbers of str
            String ch = "" + str.charAt(i);
            if (!result.contains(ch)) {//if the chracter is not contained in the result
                result += ch;// the character will added to the result
            }

        }

        System.out.println(result);
    }
}
/*
2. Write a program that can remove the duplicated characters from a String
			Ex:
				input:
					AABBCCBC

				Output:
					ABC

			Hint: You can add each characters of the string into another String
				  Condition: the character is not contained in the other String yet
						 before you are adding
 */