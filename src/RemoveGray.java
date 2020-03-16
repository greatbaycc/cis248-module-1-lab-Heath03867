import java.util.Scanner;

public class RemoveGray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int red;
        int green;
        int blue;
        int smallest;

        red = input.nextInt();
        green = input.nextInt();
        blue = input.nextInt();

        if ((red < blue) && (red < green)){
            smallest = red;
        }
        else if ((green < red) && (green < blue)){
            smallest = green;
        }
        else {
            smallest = blue;
        }

        red -= smallest;
        green -= smallest;
        blue -= smallest;

        System.out.println(red + " " + green + " " + blue);

    }
}
