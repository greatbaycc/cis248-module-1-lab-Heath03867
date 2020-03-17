import java.util.Scanner;

public class ConvertBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positiveInt;
        positiveInt = input.nextInt();


        while (positiveInt > 0){
            System.out.print(positiveInt % 2);
            positiveInt = positiveInt / 2;
        }
        System.out.println("");
    }
}
