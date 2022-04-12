package day15_ForLoops.day21_ForEachLoop;

public class Initials {

    public static void main(String[] args) {

        String[] names ={"Elminur Ablimit","Ali Kilic","Hulya Keles","Simen Kaya","Begench Begenov","Ruveyda Durda"};


        for (String each : names) {
            String initials =each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1);
            System.out.println(initials);
        }













    }
}
