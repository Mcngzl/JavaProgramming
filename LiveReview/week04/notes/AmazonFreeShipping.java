package week04.notes;

public class AmazonFreeShipping {
    public static void main(String[] args) {

        double totalPrice =55.50;

        if (totalPrice>=25.0){
            System.out.println("FREE shipping elgible.Your order total: $"+totalPrice);}
        else{
            System.out.println("NOT eligible for free shipping :$"+totalPrice);
        }

        System.out.println("Thanks for shopping with us !");



    }
}
