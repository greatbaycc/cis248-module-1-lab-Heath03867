import java.util.Scanner;

public class SwappingValues {
    public static void swapValues(int[] values) {
        int i;
        int tempStore;

        for (i = 0; i < (values.length / 2); ++i) {
            tempStore = values[i];
            values[i] = values[values.length - 1 - i];
            values[values.length - 1 - i] = tempStore;
        }
    }
    public void displayValues(int[] values) {



        System.out.println(values[0] + " " + values[1]);
    }

    public void fillValues(int[] values){
        Scanner input = new Scanner(System.in);
        int i;

        for (i = 0; i < values.length; ++i){
            values[i] = input.nextInt();
        }

    }

    public static void main(String[] args){
        SwappingValues arrayChange = new SwappingValues();
        final int numElements = 2;
        int[] userVals = new int[numElements];

        arrayChange.fillValues(userVals);
        arrayChange.swapValues(userVals);
        arrayChange.displayValues(userVals);

    }
}
