import java.util.Scanner;

public class MaxAndMin {
    public static int largestNumber(int num1, int num2, int num3){
        if (num1 > num2 && num1 > num3){
            return num1;
        }
        else if (num2 > num1 && num2 > num3){
            return num2;
        }
        else {
            return num3;
        }
    }
    public static int smallestNumber(int num1, int num2, int num3){
        if (num1 < num2 && num1 < num3){
            return num1;
        }
        else if (num2 < num1 && num2 < num3){
            return num2;
        }
        else {
            return num3;
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        System.out.println("largest: " + largestNumber(x, y, z));
        System.out.println("smallest: " + smallestNumber(x, y, z));

    }
}
