import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char userChar;
        String userString;
        int count = 0;

        userChar = input.next().charAt(0);
        userString = input.nextLine();

        for (int i = 0; i < userString.length(); ++i){
            if (userString.charAt(i) == userChar){
                count += 1;
            }
        }
        System.out.println(count);

    }
}
