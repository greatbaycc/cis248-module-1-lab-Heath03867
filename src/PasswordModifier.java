import java.util.Scanner;

public class PasswordModifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput;

        userInput = input.nextLine();

        /**i becomes !
         a becomes @
         m becomes M
         B becomes 8
         o becomes .**/

        userInput = userInput.replace('i', '!');
        userInput = userInput.replace('a', '@');
        userInput = userInput.replace('m', 'M');
        userInput = userInput.replace('B', '8');
        userInput = userInput.replace('o', '.');

        userInput = userInput.concat("q*s");

        System.out.println(userInput);
    }
}