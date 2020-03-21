import java.util.Scanner;

public class StepCounter {
    public static double stepsToMiles(int userSteps){
       final double mile = 2000;

       return userSteps / mile;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        StepCounter convert = new StepCounter();

        int steps;

        steps = input.nextInt();

        double totalMiles = convert.stepsToMiles(steps);
        System.out.printf("%.2f", totalMiles);


    }
}
