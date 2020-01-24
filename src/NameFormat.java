import java.util.Scanner;

public class NameFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstName = input.nextLine();
        String middleName = input.nextLine();
        String lastName = input.nextLine();

        if (middleName.length() == 0){
            System.out.print(lastName + ", " + firstName);
        }
        else{
            System.out.print(lastName + ", " + firstName + " " + middleName.charAt(0) + ".");
        }



    }
}

