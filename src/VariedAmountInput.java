import java.util.Scanner;

public class VariedAmountInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput;
        int maxInt = 0;
        int subtotal = 0;
        int index = 0;
            userInput = input.nextInt();

        while (userInput >= 0){
            index += 1;
            if (userInput > maxInt){
                maxInt = userInput;
            }
            subtotal += userInput;
            userInput = input.nextInt();
        }
        System.out.println(subtotal/index + " " + maxInt);
    }
}