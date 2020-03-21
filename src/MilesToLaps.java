import java.util.Scanner;

public class MilesToLaps {
    public static double milesToLaps(double userMiles) {
        final double lap = .25;

        return userMiles / lap;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MilesToLaps lapCounter = new MilesToLaps();
        Double miles;

        miles = input.nextDouble();

        double totalLaps = lapCounter.milesToLaps(miles);
        System.out.printf("%.2f", totalLaps);



    }
}