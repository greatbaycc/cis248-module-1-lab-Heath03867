import java.util.Scanner;

public class Jiffy {
    public static double secondsToJiffies(double userSeconds){
        final double jiffy = .01;

        return userSeconds / jiffy;

    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Jiffy convert = new Jiffy();
        int seconds;

        seconds = input.nextInt();

        double totalJiffies = secondsToJiffies(seconds);
        System.out.printf("%.2f", totalJiffies);

    }
}
