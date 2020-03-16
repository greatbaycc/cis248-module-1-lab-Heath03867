import java.util.Scanner;

public class HighwayNumbers {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int highwayNumber;
        int primaryNumber;
        int lastTwo;

        highwayNumber = scnr.nextInt();

        if (highwayNumber < 100 && highwayNumber > 0){
            if (highwayNumber % 2 == 0){
                System.out.println("I-" + highwayNumber + " is primary, going east/west.");
            }
            else {
                System.out.println("I-" + highwayNumber + " is primary, going north/south.");
            }
        }
        else if (highwayNumber > 99 && highwayNumber <1000){
            lastTwo = highwayNumber % 100;

            if (lastTwo % 2 == 0){
                System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + lastTwo + ", going east/west.");
            }
            else {
                System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + lastTwo + ", going north/south.");
            }

        }
        else {
            System.out.println(highwayNumber + " is not a valid interstate highway number.");
        }
    }
}