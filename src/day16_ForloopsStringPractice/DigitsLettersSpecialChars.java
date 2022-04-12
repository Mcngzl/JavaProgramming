package day16_ForloopsStringPractice;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {

        String str ="Cydeo112345school1) (@#$%WoodenSpoon";

        String digits ="";//12345
        String letters = "";//CydeoWoodenSpoon
        String specialChars ="";//!@#

        for (int i = 0; i < str.length(); i++) {// i:index numbers of str
            char ch =str.charAt(i); // ch:each character that we have in str
           if (ch>='0' &&ch<='9'){//if the character is between "0" en "9" it is digit
               digits += ch;
           }else if (ch>='A' && ch<='Z'){// if the character is between 'A' en 'Z' it is letter
               letters += ch;
           }else if (ch>='a' && ch<='z'){//if the character is between 'a' en 'z' it is letter
               letters +=ch;
           }else {//if the character is neither digit nor letter then it is special character
               if (ch != ' '){
                   specialChars += ch;
               }

           }


        }

        System.out.println("specialChars = " + specialChars);
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);




    }
}
