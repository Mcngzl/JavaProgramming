package day09_IfStatements;

public class SalaryAfterTax {
    public static void main(String[] args) {
        double afterTaxSalary;
        int salary = 75_000;
        boolean a = salary>=130000;
        boolean b= salary>=100000 && salary<1300000;
        boolean c= salary>= 80000 && salary < 100000;
        boolean d = salary <80000;
        boolean isMarried = false;

        if (isMarried && a){
            afterTaxSalary =salary-(salary*30/100);}
        else if (isMarried&& b){
            afterTaxSalary =salary-(salary*25/100);}
        else if (isMarried&& c){
            afterTaxSalary =salary-(salary*20/100);}
        else if (isMarried && d){
            afterTaxSalary=salary -(salary*15/100);}
        else if (!isMarried&& a){
            afterTaxSalary= salary -(salary*35/100);
        }else if(!isMarried && b){
            afterTaxSalary = salary-(salary*30/100);
        }else if (!isMarried && c){
            afterTaxSalary = salary-(salary*25/100);
        }else {
            afterTaxSalary =salary-(salary*20/100);
        }
        System.out.println("afterTaxSalary = " + afterTaxSalary);




    }
}
/*
2. Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                35% for salary of 130K or more
      			30% for salary of 100K to 130k (excluded)
      			25% for salary of 80K to 100K (excluded)
      			20% for salary less than 80K

                in addition, if the person is married, he/she will pay 5% less tax

 */