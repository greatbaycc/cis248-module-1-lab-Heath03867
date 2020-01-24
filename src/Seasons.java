import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String inputMonth;
        int inputDay;

        inputMonth = scnr.nextLine();
        inputDay = scnr.nextInt();
        System.out.print(inputMonth + " ");
        System.out.print(inputDay);
        System.out.println("");

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
        else{
            System.out.print("Invalid");
        }


    }
}
