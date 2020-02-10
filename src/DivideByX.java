import java.util.Scanner;

public class DivideByX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userNum = input.nextInt();
        int x = input.nextInt();
        userNum = userNum/x;
        System.out.print(userNum + " ");
        userNum = userNum/x;
        System.out.print(userNum + " ");
        userNum = userNum/x;
        System.out.println(userNum);
    }
}