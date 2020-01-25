import java.util.Scanner;

public class PeopleWeights {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double total = 0;
        double max;

        final int NUM_VALS = 5;
        double[] userWeights = new double[NUM_VALS];

        //prompt and receive input of weights
        //stored in array

        for (int i = 0; i < NUM_VALS; ++i){
            System.out.println("Enter weight " + (i + 1) + ":");
            userWeights[i] = scnr.nextDouble();

        }

        //output the weights received

        System.out.print("You entered: ");
        for (int i = 0; i < NUM_VALS; ++i){
            System.out.print(userWeights[i] + " ");
        }

        System.out.println("");
        System.out.println("");

        //output total weights
        for (int i = 0; i < NUM_VALS; ++i){
            total += userWeights[i];
        }
        System.out.println("Total weight: " + total);

        //output average
        System.out.println("Average weight: " + (total / NUM_VALS));

        //find and output max value

        max = userWeights[0];
        for (int i = 0; i < NUM_VALS; ++i){
            if (userWeights[i] > max){
                max = userWeights[i];
            }
        }
        System.out.println("Max weight: " + max);

    }
}
