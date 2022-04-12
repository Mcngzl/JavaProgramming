package week04.notes;

public class VendingNestedIf {
    public static void main(String[] args) {
        String selection ="drink";
        String drinkItem ="coffee";
        String snackItem ="chips";
        // we will not use "=="sign for String equality ,we will use equals() method

        if (selection=="drink"){
            System.out.println("drink option is selected");
            if (drinkItem=="tea"){
                System.out.println("tea item selected");
            }else if (drinkItem=="coffee"){
                System.out.println("coffee item selected");
            }

        }else if(selection=="snack"){
            System.out.println("Snack option selected");
            if (snackItem=="chips"){
                System.out.println("chips is selected");
            }else if (snackItem=="candy"){
                System.out.println("candy is selected");
            }

        }else{
            System.err.println("Invalid Entry");
        }






    }
}
