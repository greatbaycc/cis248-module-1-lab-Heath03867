import java.util.Scanner;

public class MiddleItem {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userValues = new int[9];  // Set of data specified by the user
        int i = 0;
        int temp;

        temp = scnr.nextInt();

        while(temp >= 0 && i < 9){
            userValues[i] = temp;
            temp = scnr.nextInt();
            ++i;
        }
        if (temp > 9){
            System.out.println("Too many inputs");
        }
        else{
            System.out.println(userValues[i/2]);
        }


    }

}
