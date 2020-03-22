import java.util.Scanner;

public class CharactersCounted {
    public static int countCharacters(char userChar, String userString){
        int count = 0;
        int i;


        for (i = 0; i < userString.length(); ++i){
            if (userString.charAt(i) == userChar){
                count += 1;
            }
        }
        return count;

    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char inputChar;
        String inputString;

        inputChar = input.next().charAt(0);
        inputString = input.nextLine();

        System.out.println(countCharacters(inputChar, inputString));

    }
}
