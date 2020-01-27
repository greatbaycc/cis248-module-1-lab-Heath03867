import java.util.Scanner;

public class NameFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // At this point, you will be reading only one line of input
        // The next three lines of code require 3 separate lines of input,
        // otherwise an exception will be thrown (this is because you are
        // using the nextLine() method specifically

        /*
        String firstName = input.nextLine();
        String middleName = input.nextLine();
        String lastName = input.nextLine();
        */

        // If you need to read individual strings on a single line of input
        // (i.e. individual strings of characters separated by whitespace)
        // then one option is to use the next() method instead. This is an
        // acceptable strategy since you will only ever have two or three names
        // in your input (though it would be good to also think about people
        // with only one name (Cher, Bono, etc) ;P

        // Here's how you could handle that:
        String firstName;
        String middleName = null;
        String lastName;
        String temp;

        firstName = input.next();
        temp = input.next();

        if (input.hasNext()) {
            middleName = temp;
            lastName = input.next();
        } else {
            lastName = temp;
        }

        // Though not explicitly stated, the tests are expecting a newline at the end
        // of the output.
        if (middleName == null){
            System.out.println(lastName + ", " + firstName);
        }
        else{
            System.out.println(lastName + ", " + firstName + " " + middleName.charAt(0) + ".");
        }
    }
}


