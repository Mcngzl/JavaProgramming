package day05_Concatenation;

public class Fullname {
    public static void main(String[] args) {

        String firstName = "Jimmy";
        String lastName = "King";
        int age = 45;
        String jobtitle ="Senior SDET";
        String companyName = "aPPLE Inc";
        double salary = 100000.58;

        String fullName = firstName + " " + lastName;


        System.out.println("Full name of the person is " +  fullName);

        System.out.println(fullName + " is " + age + " years old");


        //FullName is Jobtitle , works at companyname,and fullName `s salary is
        System.out.println(fullName + " is " + jobtitle +" ,works at " + companyName
                        + " , and " +fullName +" `s salary is $ " +salary);







    }







}
