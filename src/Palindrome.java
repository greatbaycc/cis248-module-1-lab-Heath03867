import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput;
        String newString = "";
        String noSpace = "";

        userInput = input.nextLine();



        for (int i = userInput.length()-1; i >= 0; --i){
            newString = newString + userInput.charAt(i);
        }

        newString = newString.replace(" ", "");
        noSpace = userInput.replace(" ", "");

        if (noSpace.equals(newString)){
            System.out.println(userInput + " is a palindrome");
        }
        else {
            System.out.println(userInput + " is not a palindrome");
        }
    }
}
