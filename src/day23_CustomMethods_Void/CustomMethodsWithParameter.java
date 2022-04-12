package day23_CustomMethods_Void;

public class CustomMethodsWithParameter {
    public static void main(String[] args) {
       // oddOrEven();//method demands additional onfo to complete its task
        oddOrEven(10);
        ageOfPerson(1980);

    }




    //create a function that can check if a number is odd number or even number
    public static void oddOrEven(int number){
        if (number%2==0){
            System.out.println(number+" is even number");
        }else {
            System.out.println(number+" is odd number");
        }
    }

    // create a function that can display the age of the person
    public static void ageOfPerson(int birthyear){

        int age =2022 -birthyear;
        System.out.println("Your age is: "+age);

    }

    //create a function that can print al the number between X and Y
    public static void printNumbers(int x,int y){

    }


}
