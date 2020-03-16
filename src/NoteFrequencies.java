import java.util.Scanner;

public class NoteFrequencies {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        double r = Math.pow(2, (1.0/12.0));
        double note = scnr.nextDouble();

        System.out.printf("%.2f", note);
        System.out.printf(" %.2f", note * Math.pow(r, 1));
        System.out.printf(" %.2f", note * Math.pow(r, 2));
        System.out.printf(" %.2f", note * Math.pow(r, 3));
        System.out.printf(" %.2f", note * Math.pow(r, 4));
        System.out.println("");
    }
}