import java.util.Scanner;

public class PhoneNumberBreakdown {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        long phoneNumber;
        long lastFour;
        long firstThree;
        long areaCode;
        // Add more variables as needed

        phoneNumber = scnr.nextLong();

        lastFour = phoneNumber % 10000;

        phoneNumber = phoneNumber / 10000;

        firstThree = phoneNumber % 1000;
        areaCode = phoneNumber /1000;

        System.out.println("(" + areaCode + ") " + firstThree + "-" + lastFour);
    }
}
