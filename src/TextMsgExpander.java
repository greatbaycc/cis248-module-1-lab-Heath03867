import java.util.Scanner;

public class TextMsgExpander {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput;
        String newInput = "";

        System.out.println("Enter text:");
        userInput = scnr.nextLine();

        System.out.println("You entered: " + userInput);
        System.out.println("");

        if (userInput.indexOf("BFF") != -1){
            System.out.println("Replaced \"BFF\" with \"best friend forever\".");
            newInput = userInput.replace("BFF", "best friend forever");
            userInput = newInput;

        }
        if (userInput.indexOf("IDK") != -1){
            System.out.println("Replaced \"IDK\" with \"I don't know\".");
            newInput = userInput.replace("IDK", "I don't know");
            userInput = newInput;

        }
        if (userInput.indexOf("JK") != -1){
            System.out.println("Replaced \"JK\" with \"just kidding\".");
            newInput = userInput.replace("JK", "just kidding");
            userInput = newInput;
        }
        if (userInput.indexOf("TMI") != -1){
            System.out.println("Replaced \"TMI\" with \"too much information\".");
            newInput = userInput.replace("TMI", "too much information");
            userInput = newInput;
        }
        if (userInput.indexOf("TTYL") != -1){
            System.out.println("Replaced \"TTYL\" with \"talk to you later\".");
            newInput = userInput.replace("TTYL", "talk to you later");
        }

        System.out.println("");
        System.out.println("Expanded: " + newInput);
    }
}