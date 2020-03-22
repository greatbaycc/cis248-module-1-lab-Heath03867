import java.util.Scanner;

public class BinaryConversion {
    public static String integerToReverseBinary(int integerValue){
        String binary = "";
        int digit;

        while (integerValue > 0){
            digit = integerValue % 2;
            binary = binary + digit;
            integerValue = integerValue / 2;
        }

        return binary;
    }
    public static String reverseString(String inputString){
        String newString = "";

        for (int i = inputString.length() - 1; i >= 0; --i){
            newString = newString + inputString.charAt(i);
        }

        return newString;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int userInteger = input.nextInt();

        System.out.println(reverseString(integerToReverseBinary(userInteger)));
    }
}
