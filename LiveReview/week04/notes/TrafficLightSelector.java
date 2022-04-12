package week04.notes;

public class TrafficLightSelector {
    public static void main(String[] args) {
        char color='d';

        switch (color){
            case 'R': case 'r': // or logic
                System.out.println("Red  light");
                break;
            case 'O': case 'o': // or logic
                System.out.println("Orange light");
                break;
            case 'G': case 'g': // or logic
                System.out.println("Green light");
                break;
            default:
                System.out.println("Invalid Light");
        }
    }
}
