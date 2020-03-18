import java.util.Scanner;

public class ContainsCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userList[] = new String[20];
        int numElements;
        char userChar;

        numElements = input.nextInt();

        for (int i = 0; i < numElements; ++i){
            userList[i] = input.next();
        }

        userChar = input.next().charAt(0);

        for (int i = 0; i < numElements; ++i){
            if (userList[i].indexOf(userChar) != -1){
                System.out.println(userList[i]);
            }

        }
    }
}
