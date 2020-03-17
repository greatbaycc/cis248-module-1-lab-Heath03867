import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput;

        userInput = input.nextInt();

        if (userInput < 20 || userInput > 98){
            System.out.println("Input must be 20-98");
            return;
        }

        while (userInput % 10 != userInput / 10){
            System.out.print(userInput + " ");
            userInput -= 1;
        }
        System.out.println(userInput + " ");
    }
}