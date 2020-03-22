import java.util.Scanner;

public class EvenOdd {
    public static boolean isArrayEven(int[] arrayValues, int arraySize){
        boolean isEven = true;

        for(int i = 0; i < arraySize; ++i){
            if (arrayValues[i] % 2 == 1){
                isEven = false;
            }
        }
        return isEven;
    }
    public static boolean isArrayOdd(int[] arrayValues, int arraySize){
        boolean isOdd = true;

        for(int i = 0; i < arraySize; ++i){
            if (arrayValues[i] % 2 == 0){
                isOdd = false;
            }
        }
        return isOdd;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        final int numElements = 20;
        int[] userVals = new int[numElements];
        int numVals = input.nextInt();

        for(int i = 0; i < numVals; ++i){
            userVals[i] = input.nextInt();
        }

        if (isArrayEven(userVals, numVals)){
            System.out.println("all even");
        }
        else if (isArrayOdd(userVals, numVals)){
            System.out.println("all odd");
        }
        else {
            System.out.println("not even or odd");
        }

    }


}
