import java.util.Scanner;

public class BruteForceEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int coeff1 = input.nextInt();
        int coeff2 = input.nextInt();
        int tot1 = input.nextInt();
        int coeff3 = input.nextInt();
        int coeff4 = input.nextInt();
        int tot2 = input.nextInt();
        int a = 0;
        int b = 0;

        for (int x = -10; x <= 10; ++x){
            for (int y = -10; y <= 10; ++y){

                if ((coeff1 * x) + (coeff2 * y) == tot1 && (coeff3 * x) + (coeff4 * y) == tot2) {
                    a = x;
                    b = y;
                }
            }
        }
        if (a == 0 && b == 0){

            System.out.println("No solution");
        }
        else{
            System.out.println(a + " " + b);

        }
    }
}