package day17_While_Dowhile;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        String str= "cat Cat dog Dog Cat cAt cat";
        int frequency=0;

        for (int i = 0; i <= str.length()-3; i++) {
            String eachSub = str.substring(i, i+3);
            //System.out.println(eachSub);

            if (eachSub.equalsIgnoreCase("cat")){
                frequency++;
            }


        }

        System.out.println(frequency);


    }
}
