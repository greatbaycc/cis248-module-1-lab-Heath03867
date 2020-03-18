import java.util.Scanner;

public class WordFrequencies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userList[] = new String[20];
        int wordFreq[]= new int[20];
        int numElements;


        numElements = input.nextInt();
        for (int i = 0; i < numElements; ++i){
            userList[i] = input.next();
        }

        for (int i = 0; i < numElements; ++i){
            wordFreq[i] = 0;
        }
        for (int i = 0; i < numElements; ++i){
            for (int j = 0; j < numElements; ++j){
                if (userList[j].equals(userList[i])){
                    wordFreq[i] += 1;
                }
            }
        }

        for (int i = 0; i < numElements; ++i){
            System.out.println(userList[i] + " " + wordFreq[i]);
        }
    }
}
