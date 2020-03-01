import java.util.Scanner;

public class CaloriesBurned{
    public static void main(String[] args) {
        int years;
        int pounds;
        int beatsPerMinute;
        int minutes;
        double manCalories;
        double womanCalories;

        Scanner input = new Scanner(System.in);

        years = input.nextInt();
        pounds = input.nextInt();
        beatsPerMinute = input.nextInt();
        minutes = input.nextInt();

        womanCalories = ((years * 0.074) - (pounds * 0.05741) + (beatsPerMinute * 0.4472) - 20.4022) * (minutes/ 4.184);
        manCalories = ((years * 0.2017) + (pounds * 0.09036) + (beatsPerMinute * 0.6309) - 55.0969) * (minutes / 4.184);

        System.out.printf("Women: %.2f calories\n", womanCalories);
        System.out.printf("Men: %.2f calories\n", manCalories);

    }
}

