import java.util.Scanner;

public class LeapYearMethod {
    public static boolean isLeapYear(int userYear){
        boolean leapYear = false;
        int lastTwo = userYear % 100;

        if (userYear > 400 && lastTwo == 0){
            if (userYear % 400 == 0){
                leapYear = true;
            }
        }
        else if (userYear % 4 == 0){
            leapYear = true;
        }

        return leapYear;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        if (isLeapYear(userInput) == true){
            System.out.println(userInput + " is a leap year.");
        }
        else {
            System.out.println(userInput + " is not a leap year.");
        }
    }
}
