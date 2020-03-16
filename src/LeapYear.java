import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int inputYear;
        boolean isLeapYear;
        int lastTwo;

        isLeapYear = false;
        inputYear = scnr.nextInt();
        lastTwo = inputYear % 100;

        if (inputYear > 400 && lastTwo == 0){
            if (inputYear % 400 == 0){
                System.out.println(inputYear + " is a leap year.");
            }
            else {
                System.out.println((inputYear + " is not a leap year."));
            }
        }
        else if (inputYear % 4 == 0){
            System.out.println(inputYear + " is a leap year.");
        }
        else{
            System.out.println(inputYear + " is not a leap year.");
        }


    }
}

