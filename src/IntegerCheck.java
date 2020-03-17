import java.util.Scanner;

public class IntegerCheck {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userString;
        char temp = ' ';
        boolean isDigit = false;

        userString = scnr.next();

        for (int i = 0; i < userString.length(); ++i){
            temp = userString.charAt(i);
            if (temp == '0' || temp == '1' || temp == '2' ||
                temp == '3' || temp == '4' || temp == '5' ||
                temp == '6' || temp == '7' || temp == '8' ||
                temp == '9'){
                isDigit = true;

            }
            else {
                isDigit = false;
                System.out.println("no");
                return;
            }

        }
        if (isDigit == true){
            System.out.println("yes");
        }
    }
}