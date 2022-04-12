package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {

        String name = "cengiz King",
                buildingNumber ="11821B",
                streetName = "Amkemaheerd",
                city = "Groningen",
                state ="GR",
                zipcode ="9736 BZ ";
        /*
        String name = "cengiz",
        String    buildingNumber ="11821B",
         String       streetName = "Amkemaheerd",
          String      city = "Groningen",
         String       state ="GR",
         String       zipcode ="9736 BZ ";
         */
        //System.out.println(name + "\n"+ buildingNumber + " " + streetName + "\n" + city + " , " + state +" " + zipcode);
       String address =name + "\n"+ buildingNumber + " " + streetName + "\n" + city + " , " + state +" " + zipcode;
        System.out.println(address);





    }
}
/*
 2. Create a class called StudentInfo, and declare variables for the followings:
    			1. student name (String)
    			2. age (int)
    			3. gender (char)
    			4. school name (String)
    			5. phone number (String) (###)-###-####
    			6. full time (boolean)

 */