import java.util.Scanner;

public class PrintStringReverse{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        String newString = "";

        while (!(userInput.equals("Quit") || userInput.equals("quit") || userInput.equals("q"))){
            for (int i = userInput.length()-1; i >=0  ; --i){
                newString = newString + userInput.charAt(i);
            }
            System.out.println(newString);
            newString = "";
            userInput = input.nextLine();
        }
    }
}