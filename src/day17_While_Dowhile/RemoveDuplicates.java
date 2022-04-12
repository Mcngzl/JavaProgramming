package day17_While_Dowhile;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str ="AABBCC";

        String result = "";

        for (int i = 0; i <str.length() ; i++) {
            String ch = ""+str.charAt(i);// ch yi char dan string yaptik
            if (result.contains(ch)){
                continue;// skipping second A or B or C
            }
            result += ch;

        }

        System.out.println(result);








    }
}
