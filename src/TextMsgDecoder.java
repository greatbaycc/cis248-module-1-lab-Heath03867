import java.util.Scanner;

public class TextMsgDecoder {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput;

        System.out.println("Enter text:");
        userInput = scnr.nextLine();

        System.out.println("You entered: " + userInput);

        if (userInput.indexOf("BFF") != -1){
            System.out.println("BFF: best friend forever");
        }
        if (userInput.indexOf("IDK") != -1){
            System.out.println("IDK: I don't know");
        }
        if (userInput.indexOf("JK") != -1){
            System.out.println("JK: just kidding");
        }
        if (userInput.indexOf("TMI") != -1){
            System.out.println("TMI: too much information");
        }
        if (userInput.indexOf("TTYL") != -1){
            System.out.println("TTYL: talk to you later");
        }

    }
}
