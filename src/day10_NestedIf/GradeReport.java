package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
        /*
        9`100;excellent
        80~90 :Great
        70~80 : Good
        60~70:Passed
        0~59: Failed
         */
        int score = 89;
        String result ="";

        if (score>=0 && score<=100){// if score is valid
            // 5 possibilities;
            if (score>=90){//score is >90
                System.out.println("Excellent");result = "excellent";
            }else if (score>=80){
                System.out.println("Great");

            }else if (score>=70){
                System.out.println("Good");

            }else if (score>=60){
                System.out.println("Passed");

            }else {
                System.out.println("Failed");

            }

        }else {//if score is NOT vali
            System.out.println("Invalid score ");

        }
        System.out.println("-----------------------------------------------");


        if (score>=0 && score<=100){// if score is valid
            // 5 possibilities;
            if (score>=90){//score is >90
                result = "excellent";
            }else if (score>=80){
                result = "Great";
            }else if (score>=70){
                result = "Good";
            }else if (score>=60){
                result = "Passed";
            }else {
                result = "failed";
            }

        }else {//if score is NOT valid
            result = "Invalid score";
        }
        System.out.println(result);










    }
}
