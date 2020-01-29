import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String inputMonth;
        int inputDay;
        String output;

        inputMonth = scnr.next();
        inputDay = scnr.nextInt();

        if (isValid(inputMonth, inputDay)) {
            if (inputMonth.equals("January") || inputMonth.equals("February")) {
                output = "Winter";
            } else if (inputMonth.equals("March")) {
                if (inputDay < 20) {
                    output = "Winter";
                } else {
                    output = "Spring";
                }
            } else if (inputMonth.equals("April") || inputMonth.equals("May")) {
                output = "Spring";
            } else if (inputMonth.equals("June")) {
                if (inputDay < 21) {
                    output = "Spring";
                } else {
                    output = "Summer";
                }
            } else if (inputMonth.equals("July") || inputMonth.equals("August")) {
                output = "Summer";
            } else if (inputMonth.equals("September")) {
                if (inputDay < 22) {
                    output = "Summer";
                } else {
                    output = "Autumn";
                }
            } else if (inputMonth.equals("October") || inputMonth.equals("November")) {
                output = "Autumn";
            } else if (inputMonth.equals("December")) {
                if (inputDay < 21) {
                    output = "Autumn";
                } else {
                    output = "Winter";
                }
            } else {
                output = "Invalid";
            }

        } else {
            output = "Invalid";
        }

        System.out.println(output);
    }

    private static boolean isValid(String month, int day) {

        //Use parallel arrays to match months with their maximum number of days
        String[] months = {
                "January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
                "November", "December"
        };
        int[] maxDays = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int i = 0;
        while (i < months.length) {
            //Check to see if the month was found
            if (months[i].equals(month)) {
                //Month found ... now check to see if the day is valid
                if (day > 0 && day <= maxDays[i]) {
                    return true;
                } else {
                    return false;
                }
            }

            i++;
        }

        //If execution is still under way at this point, it means the month
        //was not found, so the date is not valid
        return false;
    }
}
