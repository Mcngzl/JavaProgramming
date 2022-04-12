package week04.notes;

public class AdaireApartment {
    public static void main(String[] args) {
        System.out.println("##### Welcome to Adire Apartement #######");
        int numberOfBedrooms =0;
        double startingPrice =0;

        switch (numberOfBedrooms){
            case 0:
                System.out.println("You have selected studio apartment");
                startingPrice=1454.0;
                break;
            case 1:
                System.out.println("You have selected one bedroom apartment");
                startingPrice=1725.0;
                break;
            case 3:
                System.out.println("You have selected two bedroom apartment");
                startingPrice=2899.0;
                break;
            default:
                System.out.println(numberOfBedrooms+"bedroom apartment not available");
                break;

        }

        System.out.println("starting price:$"+startingPrice);




    }
}
