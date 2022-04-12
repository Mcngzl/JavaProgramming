package day15_ForLoops;

public class StringMethods {
    public static void main(String[] args) {
        String str = "  ";

        boolean r = str.isEmpty();
        System.out.println(r);

        boolean r1 = str.isBlank();
        System.out.println(r1);

        System.out.println("-----------------------------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println("---------------------------");
        //yes Yes yEs yeS....
        System.out.println("yEs".equals("Yes"));//false
        System.out.println("yEs".equalsIgnoreCase("Yes"));//true

        System.out.println("------------------------------");

        String sentence = "My favorite programming language is Java";
        boolean hasCSharp = sentence.contains("C#");
        boolean hasJAva = sentence.contains("Java");
        boolean hasJava2 = sentence.contains("java");
        boolean hasJava3 = sentence.toLowerCase().contains("java");// <===  bu guzel
        boolean r4 = sentence.contains("Java") || sentence.contains("java");// bu iyi degil jAvA bunu vermez

        System.out.println(hasCSharp);
        System.out.println(hasJAva);
        System.out.println(hasJava2);
        System.out.println(hasJava3);
        System.out.println("------------------------------------------");


        String input1 = "Ilove Java";
        String input2 = "Java";

        System.out.println(input1.equals(input2));//false
        System.out.println(input1.equalsIgnoreCase(input2));//false
        System.out.println(input1.contains("java"));//false

        System.out.println(input1.toLowerCase().contains("java"));//true
        System.out.println(input1.toUpperCase().contains("JAVA"));//true

        System.out.println("----------------------------------------");
        String a = "Wooden Spoon";

        boolean x = a.startsWith("Woo");
        boolean y = a.endsWith("Spoon");
        boolean z = a.toLowerCase().endsWith("spoon");//once kucuk harfe cevir sonra sor bunla bitiyormu diye

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);


    }
}
