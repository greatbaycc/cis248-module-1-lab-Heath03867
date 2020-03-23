import java.util.Scanner;

public class AdjustByNormalizing {
    public static int getMinimumInt(int[] listInts, int listSize){
        int smallest = listInts[0];

        for (int i = 0; i < listSize; ++i){
            if (listInts[i] < smallest){
                smallest = listInts[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arrayList = new int[20];
        int numElement = input.nextInt();
        int minValue;

        for (int i = 0; i < numElement; ++i){
            arrayList[i] = input.nextInt();
        }
        minValue = getMinimumInt(arrayList, numElement);

        for (int i = 0; i < numElement; ++i){
            System.out.print(arrayList[i] - minValue + " ");
        }
        System.out.println();
    }
}
