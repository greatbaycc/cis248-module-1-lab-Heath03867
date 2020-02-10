import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String inputMonth;
        int inputDay;

        inputMonth = scnr.next();
        inputDay = scnr.nextInt();


        if (inputMonth.equals("March")){
            if (inputDay < 20 && inputDay > 0){
                System.out.println("Winter");
            }
            else if (inputDay >= 20 && inputDay <= 31){
                System.out.println("Spring");
            }
            else{
                System.out.println("Invalid");
            }

        }
        else if (inputMonth.equals("June")){
            if (inputDay < 20 && inputDay > 0){
                System.out.println("Spring");
            }
            else if (inputDay >= 20 && inputDay <= 30){
                System.out.println("Summer");
            }
            else{
                System.out.println("Invalid");
            }

        }
        else if (inputMonth.equals("September")){
            if (inputDay < 22 && inputDay > 0){
                System.out.println("Summer");
            }
            else if (inputDay >= 22 && inputDay <= 30){
                System.out.println("Autumn");
            }
            else{
                System.out.println("Invalid");
            }

        }
        else if (inputMonth.equals("December")){
            if (inputDay < 20 && inputDay > 0){
                System.out.println("Autumn");
            }
            else if (inputDay >= 20 && inputDay <= 31){
                System.out.println("Winter");
            }
            else{
                System.out.println("Invalid");
            }

        }
        else if (inputMonth.equals("April")){
                if (inputDay > 0 && inputDay < 31){
                    System.out.println("Spring");
                }
                else{
                    System.out.println("Invalid");
                }
        }
        else if (inputMonth.equals("May")){
            if (inputDay > 0 && inputDay < 32){
                System.out.println("Spring");
            }
            else{
                System.out.println("Invalid");
            }
        }
        else if (inputMonth.equals("July")){
            if (inputDay > 0 && inputDay < 32){
                System.out.println("Summer");
            }
            else{
                System.out.println("Invalid");
            }
        }
        else if (inputMonth.equals("August")){
            if (inputDay > 0 && inputDay < 32){
                System.out.println("Summer");
            }
            else{
                System.out.print("Invalid");
            }
        }
        else if (inputMonth.equals("October")){
            if (inputDay > 0 && inputDay < 32){
                System.out.println("Autumn");
            }
            else{
                System.out.println("Invalid");
            }
        }
        else if (inputMonth.equals("November")){
            if (inputDay > 0 && inputDay < 31){
                System.out.println("Autumn");
            }
            else{
                System.out.println("Invalid");
            }
        }
        else if (inputMonth.equals("January")){
            if (inputDay > 0 && inputDay < 32){
                System.out.println("Winter");
            }
            else{
                System.out.println("Invalid");
            }
        }
        else{
            System.out.println("Invalid");
        }


    }
}
