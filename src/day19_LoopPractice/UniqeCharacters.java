package day19_LoopPractice;

public class UniqeCharacters {
    public static void main(String[] args) {
        String str = "aabccdeef";
        String result ="";

        for (int j = 0; j <str.length() ; j++) {

            char ch =str.charAt(j);
            int count =0;//represents the frequency of the ch
            for (int i = 0; i <str.length() ; i++) {
                char each = str.charAt(i);
                if (ch==each){
                    count++;
                }
            }
            if (count==1){//if the frequency =1 it is unique
                result += ch;
            }

        }

        System.out.println(result);










    }
}
/*
2. Write a program that can find the unique characters from a string without using indexOf() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf

 */