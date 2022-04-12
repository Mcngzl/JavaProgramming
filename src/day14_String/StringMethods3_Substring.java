package day14_String;

public class StringMethods3_Substring {
    public static void main(String[] args) {
        // substring (beginning index, ending index )
        String word = "Cydeo School";
        //             012345

        String brand = word.substring(0, 4); // Cyde 4 e kadar yazdirdi
        System.out.println("brand = " + brand);

        String word2 = word.substring(6); // 6 .inci karakterden sonuna kadar yazdirir
        System.out.println("word2 = " + word2);

        String word3 = "Java Programming Language";

        String s1= word3.substring(0, word3.indexOf(" "));// Java
        //String s2= word3.substring(word3.indexOf("P"), word3.indexOf(" L")); // Programming ==>  buda olabilir
        String s2= word3.substring(word3.indexOf(" ")+1, word3.lastIndexOf(" ")); // Programming
        String s3= word3.substring(word3.lastIndexOf(" ")+1);// Language

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);


    }
}
