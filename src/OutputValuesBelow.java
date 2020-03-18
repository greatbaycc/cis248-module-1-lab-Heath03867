import java.util.Scanner;

public class OutputValuesBelow {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userValues = new int[20];   // List of integers from input
        int numElements;
        int threshold;
        numElements = scnr.nextInt();

        for (int i = 0; i < numElements; ++i){
            userValues[i] = scnr.nextInt();
        }
        threshold = scnr.nextInt();

        for (int i = 0; i < numElements; ++i) {
            if (userValues[i] < threshold) {
                System.out.print(userValues[i] + " ");
            }
        }
        System.out.println("");
    }
}
