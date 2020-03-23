import java.util.Scanner;

public class WordFrequenciesMethod {
    public static int getFrequencyOfWord(String[] wordList, int listSize, String currWord){
        int count = 0;

        for (int i = 0; i < listSize; ++i){
           if (wordList[i].equals(currWord)){
               count += 1;
           }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userList[] = new String[20];
        int wordFreq[]= new int[20];
        int numElements = input.nextInt();
        int i;

        for (i = 0; i < numElements; ++i){
            userList[i] = input.next();
        }

        for (i = 0; i < numElements; ++i){
            wordFreq[i] = 0;
        }

        for (i = 0; i < numElements; ++i){
            System.out.println(userList[i] + " " + getFrequencyOfWord(userList, numElements, userList[i]));
        }

    }
}
