package week07;

public class Task01 {
    public static void main(String[] args) {
        int rowCount = 5;
        for(int row=1; row<=rowCount ; row++){

            int value = row;
            for(int col = 1; col <=row ; col++){
                System.out.print(value+" ");
                value += rowCount - col; // adding 4 for col=1, adding 3 col=2
            }
            System.out.println();
    }
}}
