import java.util.Scanner;

public class NumbersInReverse {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userList = new int[20];   // List of numElement integers specified by the user
        int numElements;                // Number of integers in user's list
        // Add more variables as needed

        numElements = scnr.nextInt();   // Input begins with number of integers that follow

        for (int i = 0; i < numElements; ++i){
            userList[i] = scnr.nextInt();
        }

        for (int j = numElements - 1; j >= 0; --j){
            System.out.print(userList[j] + " ");
        }
        System.out.println("");
    }
}