import java.util.Scanner;
import java.lang.Math;     // Note: Needed for math functions in part (3)

public class PaintEstimator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight;
        double wallWidth;
        double wallArea;
        final double oneGallon = 350;
        double roundQuantity = 0;
        int quantity;

        System.out.println("Enter wall height (feet):");
        wallHeight = scnr.nextDouble();

        System.out.println("Enter wall width (feet):");
        wallWidth = scnr.nextDouble();                      //  (1): Prompt user to input wall's width

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;                        // (1): Calculate the wall's area
        System.out.println("Wall area: " + wallArea + " square feet");     //  (1): Finish the output statement

        // (2): Calculate and output the amount of paint in gallons needed to paint the wall
        System.out.println("Paint needed: " + (wallArea / oneGallon) + " gallons");

        // (3): Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer

        if(((wallArea/oneGallon) % 2) != 0){
            roundQuantity = Math.round(wallArea/oneGallon);
        }
        quantity = (int)roundQuantity;

        System.out.println("Cans needed: " + quantity + " can(s)");
    }
}