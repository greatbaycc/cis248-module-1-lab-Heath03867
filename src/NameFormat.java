import java.util.Scanner;

public class NameFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstName;
        String middleName;
        String lastName;
        String temp;

        firstName = input.next();
        temp = input.next();
        lastName = input.nextLine(); //this finalizes the line of input and will be empty if there is no third name

        if (lastName.isBlank()) {
            lastName = temp;
            middleName = null;
        } else {
            middleName = temp;
        }

        if (middleName == null){
            System.out.println(lastName + ", " + firstName);
        } else {
            System.out.println(lastName + ", " + firstName + " " + middleName.charAt(0) + ".");
        }

    }
}


