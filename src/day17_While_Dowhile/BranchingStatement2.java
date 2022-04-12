package day17_While_Dowhile;

public class BranchingStatement2 {
    public static void main(String[] args) {

        for (char i = 'A'; i <='E' ; i++) {
            if (i=='C'){
                continue;// for skipping C
            }


            System.out.println(i);
        }
        System.out.println("-----------------------------------------");
        //print all even number 1 to 10 (skip the odd numbers)

        for (int i = 1; i <=10 ; i++) {
            if (i%2!=0){
                continue;

            }
            System.out.println(i);
        }






        System.out.println("------------------------------");
        //print all odd numbers 1~10


        for (int i = 1; i <=10 ; i++) {
            if (i%2==0){
                continue;

            }
            System.out.println(i);
        }



    }
}
