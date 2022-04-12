package day10_NestedIf;

public class GradeReport2 {
    public static void main(String[] args) {
        int s = 89;
        String result ="";

        if (s>=0 && s<=100){// if s is valid
            // 5 possibilities;
            if (s>=90){//s is >90
                System.out.println("Excellent");result = "excellent";
            }else if (s>=80){
                System.out.println("Great");

            }else if (s>=70){
                System.out.println("Good");

            }else if (s>=60){
                System.out.println("Passed");

            }else {
                System.out.println("Failed");

            }

        }else {//if s is NOT valid
            System.out.println("Invalid s ");
        }
        System.out.println("------------------------------------------------");
        // solution 2 ; use ternaries only

       result =  (s>=0 && s<=100)? (s>=90)?"Excellent":(s>=80)?"Great":(s>=70)?"Good"
                :(s>=60)?"Passed":"Failed": "Invalid score";
        System.out.println(result);
        System.out.println("--------------------------------------------------------------");
String result2 ="";
        //solution3
        if (s>=0 && s<=100){// if s is valid
            // 5 possibilities;
           result2= (s>=90)?"Excellent":(s>=80)?"Great":(s>=70)?"Good"
                    :(s>=60)?"Passed":"Failed";

        }else {//if s is NOT valid
            System.out.println("Invalid s ");
        }
        System.out.println(result2);







    }


}
