import java.util.Scanner;
import java.lang.Math;

public class MaxMagnitude {
    public static int maxMagnitude(int userVal1, int userVal2){
        int absUserVal1;
        int absUserVal2;

        absUserVal1 = Math.abs(userVal1);
        absUserVal2 = Math.abs(userVal2);

        if (absUserVal1 > absUserVal2){
            return userVal1;
        }
        else {
            return userVal2;
        }

    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        int magnitude = maxMagnitude(x, y);

        System.out.println(magnitude);
    }
}
