import java.util.Scanner;

public class AdjustListNormalizing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userValues[] = new int[20];
        int numElements;
        int smallest;

        numElements = input.nextInt();

        for (int i = 0; i < numElements; ++i){
            userValues[i] = input.nextInt();
        }
        smallest = userValues[0];

        for(int i = 0; i < numElements; ++i){
            if (smallest > userValues[i]) {
                smallest = userValues[i];
            }
        }

        for(int i = 0; i < numElements; ++i){
            userValues[i] -= smallest;
        }

        for(int i = 0; i < numElements; ++i){
            System.out.print(userValues[i] + " ");
        }
        System.out.println("");

    }
}
