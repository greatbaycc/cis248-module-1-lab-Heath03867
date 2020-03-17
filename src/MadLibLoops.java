import java.util.Scanner;

public class MadLibLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userString = "";
        int userInt = 0;

        userString = input.next();
        userInt = input.nextInt();

        do{
            System.out.println("Eating " + userInt + " " + userString + " a day keeps the doctor away.");
            userString = input.next();
            userInt = input.nextInt();
        } while (userString != "quit" && userInt != 0);

    }
}