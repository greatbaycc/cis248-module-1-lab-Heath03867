import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String inputMonth;
        int inputDay;

        inputMonth = scnr.nextLine();
        inputDay = scnr.nextInt();


        if (inputMonth.equals("March")){
            if (inputDay < 20 && inputDay > 0){
                System.out.print("Winter");
            }
            else if (inputDay >= 20 && inputDay <= 31){
                System.out.print("Spring");
            }
            else{
                System.out.print("Invalid");
            }

        }
        else if (inputMonth.equals("June")){
            if (inputDay < 20 && inputDay > 0){
                System.out.print("Spring");
            }
            else if (inputDay >= 20 && inputDay <= 30){
                System.out.print("Summer");
            }
            else{
                System.out.print("Invalid");
            }

        }
        else if (inputMonth.equals("September")){
            if (inputDay < 22 && inputDay > 0){
                System.out.print("Summer");
            }
            else if (inputDay >= 22 && inputDay <= 30){
                System.out.print("Autumn");
            }
            else{
                System.out.print("Invalid");
            }

        }
        else if (inputMonth.equals("December")){
            if (inputDay < 20 && inputDay > 0){
                System.out.print("Autumn");
            }
            else if (inputDay >= 20 && inputDay <= 31){
                System.out.print("Winter");
            }
            else{
                System.out.print("Invalid");
            }

        }
        else if (inputMonth.equals("April")){
                if (inputDay > 0 && inputDay < 31){
                    System.out.print("Spring");
                }
                else{
                    System.out.print("Invalid");
                }
        }
        else if (inputMonth.equals("May")){
            if (inputDay > 0 && inputDay < 32){
                System.out.print("Spring");
            }
            else{
                System.out.print("Invalid");
            }
        }
        else if (inputMonth.equals("July")){
            if (inputDay > 0 && inputDay < 32){
                System.out.print("Summer");
            }
            else{
                System.out.print("Invalid");
            }
        }
        else if (inputMonth.equals("August")){
            if (inputDay > 0 && inputDay < 32){
                System.out.print("Summer");
            }
            else{
                System.out.print("Invalid");
            }
        }
        else if (inputMonth.equals("October")){
            if (inputDay > 0 && inputDay < 32){
                System.out.print("Autumn");
            }
            else{
                System.out.print("Invalid");
            }
        }
        else if (inputMonth.equals("November")){
            if (inputDay > 0 && inputDay < 31){
                System.out.print("Autumn");
            }
            else{
                System.out.print("Invalid");
            }
        }
        else{
            System.out.print("Invalid");
        }


    }
}
