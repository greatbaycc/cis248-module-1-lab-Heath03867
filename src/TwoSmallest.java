import java.util.Scanner;

public class TwoSmallest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int userList[] = new int[20];
        int numElements;
        int smallest;
        int secondSmallest;

        numElements = input.nextInt();

        for (int i = 0; i < numElements; ++i){
            userList[i] = input.nextInt();
        }

        smallest = userList[0];
        secondSmallest = userList[1];

        for (int i = 2; i < numElements; ++i){
            if (userList[i] < smallest) {
                secondSmallest = smallest;
                smallest = userList[i];
            }
            else if (secondSmallest > userList[i]){
                secondSmallest = userList[i];
            }
        }
        System.out.println(smallest + " " + secondSmallest);
    }
}
