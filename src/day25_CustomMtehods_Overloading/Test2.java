package day25_CustomMtehods_Overloading;

import utilities.ArraysUtility;

public class Test2 {
    public static void main(String[] args) {

        int[] arr1={1,2,3,4,5};
        ArraysUtility.PrintEachElement(arr1);

        System.out.println("-------------------------------------");


        double[] arr2 ={10.5,2,1.8,3.2,3.5};
        ArraysUtility.PrintEachElement(arr2);

        System.out.println("----------------------");
        char[] arr3 ={'A','B','C','D'};

        ArraysUtility.PrintEachElement(arr3);

        System.out.println("--------------------------");

        String[] names={"Daviv","Elviva","Tiran"};
        ArraysUtility.PrintEachElement(names);
        System.out.println("----------------------------------------------");


        int[] n1 ={1,2,3,4,5,6};
        int max1= ArraysUtility.max(n1);
        System.out.println("max1 = " + max1);

        System.out.println("-----------------------------------");

        double[] n2 ={1.1,2.2,3.3,5.5,4.4,6.6};
        double max2 =ArraysUtility.max(n2);
        System.out.println("max2 = " + max2);

        System.out.println("--------------------------");


        int[] a1= {1,2,3,4,5,6,4,7};
        boolean r1 = ArraysUtility.contains(a1,5);
        System.out.println("r1 = " + r1);





    }


}
