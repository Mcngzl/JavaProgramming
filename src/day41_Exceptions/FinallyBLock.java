package day41_Exceptions;

public class FinallyBLock {
    public static void main(String[] args) {

        int[] arr ={1,2,3};

        try{
            System.out.println(arr[10]);
            System.out.println("Try block");
        }catch (RuntimeException e){
            System.out.println("Catch Block");
            e.printStackTrace();
            System.exit(0);//this is the uniqe method that can block the finally block
        }finally {
            System.out.println("Finally Block");
        }





    }
}