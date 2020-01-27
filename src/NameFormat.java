import java.util.Scanner;
import java.util.StringTokenizer;

public class NameFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fullName = input.nextLine(); //Grabs the entire name, including spaces
        StringTokenizer tokenizer = new StringTokenizer(fullName);

        String firstName = tokenizer.nextToken().strip();
        String temp = tokenizer.nextToken().strip();

        String middleName, lastName;

        if (tokenizer.hasMoreTokens()) {
            middleName = temp;
            lastName = tokenizer.nextToken();
        } else {
            middleName = null;
            lastName = temp;
        }

        if (middleName == null){
            System.out.println(lastName + ", " + firstName);
        } else {
            System.out.println(lastName + ", " + firstName + " " + middleName.charAt(0) + ".");
        }
    }
}


