package day15_ForLoops.day21_ForEachLoop;

public class ForEachLoopPractice {
    public static void main(String[] args) {
        
        String[] words ={"Java programming","Cydeo school","Wooden spoon","Early Birds","Angry birds"};

        for (String each:words){
            System.out.println(each.charAt(0)+""+ each.charAt(each.length()-1));
        }
        
        
        
        
        
    }
}
