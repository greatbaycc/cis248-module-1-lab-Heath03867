import java.util.Scanner;

public class NameFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstName;
        String middleName = null;
        String lastName;
        String temp;

        firstName = input.next();
        temp = input.next();



        if (input.hasNext()){
            middleName = temp;
            lastName = input.next();
        }
        else{
            lastName = temp;
        }

        if (middleName == null){
            System.out.println(lastName + ", " + firstName);
        }
        else{
            System.out.println(lastName + ", " + firstName + " " + middleName.charAt(0) + ".");
        }

    }
}

