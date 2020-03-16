import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int smallest;

        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        if ((num1 < num2) && (num1 < num3)){
            smallest = num1;
        }
        else if ((num2 < num3) && (num2 < num1)){
            smallest = num2;
        }
        else {
            smallest = num3;
        }

        System.out.println(smallest);
    }
}
