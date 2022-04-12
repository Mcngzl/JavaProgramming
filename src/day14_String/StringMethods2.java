package day14_String;

public class StringMethods2 {
    public static void main(String[] args) {

        String str = "Java is fun,I love learning java";
        String str2=str.replace("Java" , "Phyton");

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = "JohnSmith@yahoo.com";
        email=email.replace("yahoo" , "gmail");

        System.out.println("email = " + email);

        String sentence = "Java Java Phyton Phyton c# c# c+ c++ Phyton Phyton Phyton";
        String sentence2 = sentence.replace("Phyton", "");
        String sentence3 = sentence2.replace("   ", " ");

        System.out.println("sentence = " + sentence);
        System.out.println("sentence2 = " + sentence2);
        System.out.println("sentence3 = " + sentence3);

        String s = "Dog Dog Dog Dog Dog Dog";
        s=s.replace("Dog", "Cat"); // "Cat ...

        System.out.println("s = " + s);

        String s2 = "C# is fun, C# is cool";
        String s3=s2.replace(" C#", "Java");

        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        String s4= "Java";
        s4= s4.replace("a", "e");

        System.out.println("s4 = " + s4); // jeve

        System.out.println("-----------------------------------------------------");

        String result = "Java Java Java";

        result = result.replaceFirst("Java", "Phyton");
        System.out.println("result = " + result);

        String result2 = "C# is fun, C# is cool";
        result2= result2.replaceFirst("C#", "Java");
        System.out.println("result2 = " + result2);

        String result3 = "Java";
        result3=result3.replaceFirst("a", "o");//Jova
        System.out.println("result3 = " + result3);




    }
}
