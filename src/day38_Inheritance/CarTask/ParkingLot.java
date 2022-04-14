package day38_Inheritance.CarTask;

public class ParkingLot {

    public static void main(String[] args) {


        Toyota toyota = new Toyota("Canry", 2020, 200000, "Gray", 123456);

        Tesla tesla = new Tesla("odel S", 2022, 94990, "red", 0);


        BMW bmw = new BMW("X5", 2020, 67350, "Black", 120000);


        toyota.start();
        tesla.start();
        bmw.start();

    }


}
