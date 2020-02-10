import java.util.Scanner;

public class DrivingCosts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double milesPer = input.nextDouble();
        double dollarsPer = input.nextDouble();
        double totalA = (20/milesPer) * dollarsPer;
        double totalB = (75/milesPer) * dollarsPer;
        double totalC = (500/milesPer) * dollarsPer;
        System.out.printf("%.2f" + " " + "%.2f" + " " + "%.2f", totalA, totalB, totalC);
        System.out.println("");
    }
}

