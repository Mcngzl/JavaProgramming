package day22_MultidimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray2 {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,};
        int[] arr2 ={4,5,6,7};
        int[] arr3 ={8,9,10,11,12};


        int[][] arr2D ={{1,2,3,},{4,5,6,7},{8,9,10,11,12}};
        //                      0       1           2               0           1           2
        //                    0 1 2    0 1 2 3   0 1 2 3 4 5       0 1  2    0  1  2     0  1  2
        int[][][] arr3D ={  {{1,2,3,},{4,5,6,7},{8,9,10,11,12}},{{10,20,30},{40,50,60},{70,80,90}}  };
        //                              0                                   1

        System.out.println(Arrays.deepToString(arr3D));//hepsi

        System.out.println(Arrays.deepToString(arr3D[1]));// 2. 2D array

        System.out.println(Arrays.toString(arr3D[1][1]));// only one Array

        System.out.println(arr3D[1][1][1]);//50 only one element
        System.out.println("----------------------------------------------");

        for (int[][] each2D :arr3D){
            for (int[] each1D : each2D) {
                for (int element : each1D) {
                    System.out.print(element+" ");
                }
            }
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------");

        int[][][][] arr4D ={ {  {{1,2,3,},{4,5,6,7},{8,9,10,11,12}},{{10,20,30},{40,50,60},{70,80,90}}  }  };
        //                                                  0

        for (int[][][] each3D : arr4D) {
            for (int[][] each2D : each3D) {
                for (int[] each1D : each2D) {
                    for (int element : each1D) {
                        System.out.print(element+" ");
                    }
                }
            }
        }







    }
}
