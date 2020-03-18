import java.util.Scanner;

public class ElementsInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userList[] = new int[20];
        int numElements;
        int lowerBoundry;
        int upperBoundry;

        numElements = input.nextInt();

        for (int i = 0; i < numElements; ++i){
            userList[i] = input.nextInt();
        }

        lowerBoundry = input.nextInt();
        upperBoundry = input.nextInt();

        for (int i = 0; i < numElements; ++i){
            if(userList[i] >= lowerBoundry && userList[i] <= upperBoundry){
                System.out.print(userList[i] + " ");

            }
        }
        System.out.println("");
    }
}
