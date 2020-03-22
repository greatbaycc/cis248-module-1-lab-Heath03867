import java.util.Scanner;

public class ExactChangeMethod {

    public static void exactChange(int userTotal, int[] coinVals){

        if (userTotal == 0) {
            System.out.println("no change");
        }

        coinVals[0] = userTotal / 100;
        userTotal = userTotal % 100;

        coinVals[1] = userTotal / 25;
        userTotal = userTotal % 25;

        coinVals[2] = userTotal / 10;
        userTotal = userTotal % 10;

        coinVals[3] = userTotal / 5;
        userTotal = userTotal % 5;

        coinVals[4] = userTotal;

        if (coinVals[0] > 1 ){
            System.out.println(coinVals[0] + " dollars");
        }
        else if (coinVals[0] == 1) {
            System.out.println((coinVals[0] + " dollar"));
        }

        if (coinVals[1] > 1 ){
            System.out.println(coinVals[1] + " quarters");
        }
        else if (coinVals[1] == 1) {
            System.out.println((coinVals[1] + " quarter"));
        }

        if (coinVals[2] > 1 ){
            System.out.println(coinVals[2] + " dimes");
        }
        else if (coinVals[2] == 1) {
            System.out.println((coinVals[2] + " dime"));
        }

        if (coinVals[3] > 1 ){
            System.out.println(coinVals[3] + " nickels");
        }
        else if (coinVals[3] == 1) {
            System.out.println((coinVals[3] + " nickel"));
        }
        if (coinVals[4] > 1 ){
            System.out.println(coinVals[4] + " pennies");
        }
        else if (coinVals[4] == 1) {
            System.out.println((coinVals[4] + " penny"));
        }

    }
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        ExactChangeMethod makeChange = new ExactChangeMethod();
        final int numElements = 5;
        int[] change = new int[numElements];
        int userInput = input.nextInt();

        makeChange.exactChange(userInput, change);
    }
}
