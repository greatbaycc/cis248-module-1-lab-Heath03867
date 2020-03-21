import java.util.Scanner;

public class CostOfDriving {
    public static double drivingCost(double drivenMiles, double MilesPerGallon, double dollarsPerGallon){
        double gallonsUsed;
        double cost;

        gallonsUsed = drivenMiles / MilesPerGallon;
        cost = gallonsUsed * dollarsPerGallon;

        return cost;


    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double mpg;
        double dpg;

        mpg = input.nextDouble();
        dpg = input.nextDouble();

        double totalCost = drivingCost(10, mpg, dpg);
        System.out.printf("%.2f ", totalCost);

        totalCost = drivingCost(50, mpg, dpg);
        System.out.printf("%.2f ", totalCost);

        totalCost = drivingCost(400, mpg, dpg);
        System.out.printf("%.2f", totalCost);

        System.out.println("");

    }
}
