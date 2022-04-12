package day17_While_Dowhile;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {

        String str ="Java Java Java Java Phyton Phyton";
        int frequency =0;


        while (str.contains("Java")){
            str= str.replaceFirst("Java","");
            frequency++;
        }
        System.out.println(frequency);
        System.out.println(str.trim());
        System.out.println("=========================================");


        String sentence = "Cat Cat Cat Dog Dog Cat Cat";
        sentence =sentence.toLowerCase();
        int countCat =0;

        while (sentence.contains("cat")){
            sentence=sentence.replaceFirst("cat", "");
            countCat++;
        }

        System.out.println(countCat);

        System.out.println("--------------------------------------");

        String s= "Java Java Java Phyton phyton phyton";
        s= s.toLowerCase();
        int countJava=0;
        int countPhyton=0;

        while (s.contains("java")|| s.contains("phyton")){

            if (s.contains("java")){
                s=s.replaceFirst("java","");
                countJava++;
            }
            if (s.contains("phyton")){
                s=s.replaceFirst("phyton","");
                countPhyton++;
            }

        }
        System.out.println("countJava = " + countJava);
        System.out.println("countPhyton = " + countPhyton);




    }
}
