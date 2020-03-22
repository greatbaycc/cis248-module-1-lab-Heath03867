import java.util.Scanner;

public class SortArray {
    public static void sortArray(int[] myArr, int arrSize){
        int temp;
        for(int i = 0; i < arrSize; ++i){
            for (int j = i; j > 0; --j){
                if (myArr[j] < myArr[j-1]){
                    temp = myArr[j];
                    myArr[j] = myArr[j - 1];
                    myArr[j-1] = temp;
                }
            }
        }

    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        final int numElements = 20;
        int[] numbers = new int[numElements];
        int numInputs = input.nextInt();

        for (int i = 0; i < numInputs; ++i){
            numbers[i] = input.nextInt();
        }

        sortArray(numbers, numInputs);

        for (int i = 0; i < numInputs; ++i){
            System.out.print(numbers[i] + " ");
        }
        System.out.println("");

    }
}
