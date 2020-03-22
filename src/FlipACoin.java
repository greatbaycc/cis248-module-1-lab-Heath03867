import java.util.Random;
import java.util.Scanner;

public class FlipACoin {
    public static String headsOrTails(Random rand){
        int iteration;
        String heads = "heads";
        String tails = "tails";

        iteration = rand.nextInt(2);

        if (iteration == 0){
            return heads;
        }
        else {
            return tails;
        }
    }
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random(2);
        int timeToRun;
        int i;

        timeToRun = scnr.nextInt();

        FlipACoin coinToss = new FlipACoin();

        for(i = 0; i < timeToRun; ++i){
            System.out.println(coinToss.headsOrTails(rand));
        }

    }
}
