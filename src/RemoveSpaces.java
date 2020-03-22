import java.util.Scanner;

public class RemoveSpaces {
    public static String removeSpaces (String userString){
       userString = userString.replace(" ", "");

        return userString;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();

        System.out.println(removeSpaces(inputString));

    }
}
