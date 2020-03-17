import java.util.Scanner;

public class CountInputLength {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userText;
        // Add more variables as needed

        userText = scnr.nextLine();  // Gets entire line, including spaces.

        userText = userText.replace(" ", "");
        userText = userText.replace(".", "");
        userText = userText.replace(",", "");

        System.out.println(userText.length());
    }
}
