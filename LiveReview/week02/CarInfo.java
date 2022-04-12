package week02;

public class CarInfo {
    public static void main(String[] args) {
        // i wan t to give an expample of the car that u will buy after you find a job
        int year = 2022;
        String make = "Audi";
        String model = "A6";
        //automatic=true; manual - false
        boolean transmission = true;
        String color ="black";
        int milage = 0;
        int price = 100_000;

        System.out.println(year+" "+make+" "+model+" "+"\nAutomatic Transmission;"+ transmission);
        System.out.println(color+" "+ milage+" "+ "kilomters "+price+"euros");


        //lets turn this value into TL 1 euro=15.5
        double priceInTL =price * 15.5;
        double taxrate= 1.80;
        double priceAfterTaxInTL = priceInTL+(priceInTL*taxrate);

        System.out.println("priceAfterTaxInTL = " + priceAfterTaxInTL);
        // Variables are used, because it makes our data reusable and maintainable







    }
}
