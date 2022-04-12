package day15_ForLoops;

public class FormatFullName {
    public static void main(String[] args) {

        String firstName ="cyDEo",
                lastName ="SCHOOL";

        //firstName =firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        //              C                                       ydeo==> Cydeo




firstName= (""+firstName.charAt(0)).toUpperCase()+firstName.substring(1).toLowerCase();
//          C

        lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        System.out.println(lastName);
        System.out.println(firstName);








    }
}
