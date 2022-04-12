package week07;

import java.util.Scanner;

public class ShoppinList2ReplitTask {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String shoppingListReport = "";
        String item ="";
        String countinue = "";
        double price = 0 ;
        int count = 1;
        double totalPrice =0;

        do {
            System.out.println("Enter Item"+count+" and its price:");
            item = scan.nextLine();
            price = scan.nextDouble();
            // Item1: Tomatoes Price: 5.5,
            shoppingListReport += "Item"+count+": "+item+" Price: "+price+",";
            count++;
            totalPrice+=price;
            System.out.println("Add one more item?");
            scan.nextLine(); // takes the enter from previous double method
            countinue = scan.nextLine();
        } while (countinue.equalsIgnoreCase("yes"));
        // to take out the comma at the end
        System.out.println(shoppingListReport.substring(0,shoppingListReport.length()-1));
        System.out.println("Total price = " + totalPrice);









    }
}
