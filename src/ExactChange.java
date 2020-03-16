import java.util.Scanner;

public class ExactChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pennies = input.nextInt();
        int dollars;
        int quarters;
        int dimes;
        int nickels;

        if (pennies == 0) {
            System.out.println("No change");
        }

        dollars = pennies / 100;
        pennies = pennies % 100;

        quarters = pennies / 25;
        pennies = pennies % 25;

        dimes = pennies / 10;
        pennies = pennies % 10;

        nickels = pennies / 5;
        pennies = pennies % 5;


        if (dollars > 0 && dollars < 2){
            System.out.println(dollars + " Dollar");
        }
        else if (dollars > 1){
            System.out.println(dollars + " Dollars");
        }

        if (quarters > 0 && quarters < 2){
            System.out.println(quarters + " Quarter");
        }
        else if (quarters > 1) {
            System.out.println(quarters + " Quarters");
        }

        if (dimes > 0 && dimes < 2){
            System.out.println(dimes + " Dime");
        }
        else if (dimes > 1){
            System.out.println(dimes + " Dimes");
        }

        if (nickels > 0 && nickels < 2){
            System.out.println(nickels + " Nickel");
        }
        else if (nickels > 1){
            System.out.println(nickels + " Nickels");
        }

        if (pennies > 0 && pennies < 2){
            System.out.println(pennies + " Penny");
        }
        else if (pennies > 1){
            System.out.println(pennies + " Pennies");
        }
    }
}