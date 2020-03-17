import java.util.Scanner;

public class OutputRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int one;
        int two;

        one = input.nextInt();
        two = input.nextInt();

        if (two < one){
            System.out.println("Second integer can't be less than the first.");
            return;
        }

        do {
            System.out.print(one + " ");
            one += 10;
        } while (one <= two);

        System.out.println("");

    }
}