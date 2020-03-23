import java.util.Scanner;

public class OutputValuesBelowMethod {
    public static void getUserValues(int[] myArr, int arrSize, Scanner scnr){
        for (int i = 0; i < arrSize; ++i){
            myArr[i] = scnr.nextInt();
        }
    }
    public static void outputIntsLessThanOrEqualToThreshold(int[] userValues, int userValsSize, int upperThreshold){
        for (int i = 0; i < userValsSize; ++i){
            if (userValues[i] < upperThreshold){
                System.out.print(userValues[i] + " ");
            }
        }
    }
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int [] values = new int[20];
        int numElements = scnr.nextInt();
        int limit;

        getUserValues(values, numElements, scnr);

        limit = scnr.nextInt();

        outputIntsLessThanOrEqualToThreshold(values, numElements, limit);

        System.out.println();

    }
}
