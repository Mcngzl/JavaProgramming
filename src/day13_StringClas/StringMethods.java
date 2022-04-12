package day13_StringClas;

public class StringMethods {
    public static void main(String[] args) {

        String word = "cydeo";
            // index : 01234
        char thirdChar = word.charAt(2);

        System.out.println("thirdChar = " + thirdChar);
/*
        char tentChar = word.charAt(9); // bu kadar karakter yoksa out of range oluyor !!!
        System.out.println("tentChar = " + tentChar);
     */
        System.out.println("------------------------------------------------");



        String s1 = "Batch 25 is the best batch";

        int totalChars = s1.length();
        System.out.println("totalChars = " + totalChars);

        char lastChar =s1.charAt( s1.length()-1 );//last index number
        System.out.println("lastChar = " + lastChar);//h

        System.out.println("----------------------------------------------------- ");

        String str ="wooden spoon";
        str=str.toUpperCase();//"WOODEN SPOON"

        System.out.println(str);

        String s="JAVA";
        s=s.toLowerCase();

        System.out.println(s);

        String sentence = "Today is a great day to learn java programming language";
        sentence=sentence.toUpperCase();
        System.out.println(sentence);




    }
}
