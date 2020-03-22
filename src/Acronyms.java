import java.util.Scanner;

public class Acronyms {
    public static String createAcronym(String userPhrase){
        String acronym = "";
        int i;

        for (i = 0; i < userPhrase.length(); ++i){
            if(userPhrase.charAt(i) >= 65 && userPhrase.charAt(i) <= 90){
                acronym = acronym + userPhrase.charAt(i);
            }
        }

        return acronym;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();

        System.out.println(createAcronym(userInput));

    }
}
