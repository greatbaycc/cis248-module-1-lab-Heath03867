import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String inputMonth;
        int inputDay;

        inputMonth = scnr.next();
        inputDay = scnr.nextInt();



    }

    private static boolean isValid(String month, int day) {
        String[] months = {
                "January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
                "November", "December"
        };

        int[] maxDays = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };


        return false;
    }
}
