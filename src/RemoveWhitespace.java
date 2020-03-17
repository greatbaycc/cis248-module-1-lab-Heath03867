import java.util.Scanner;

public class RemoveWhitespace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput;

        userInput = input.nextLine();
        userInput = userInput.replace(" ", "");

        System.out.println(userInput);
    }
}