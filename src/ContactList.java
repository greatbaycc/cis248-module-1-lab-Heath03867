import java.util.Scanner;

public class ContactList {
    public static String getPhoneNumber(String[] nameVec, String[] phoneNumberVec, String contactName, int arraySize){
        String number = null;
        for (int i = 0; i < arraySize; ++i){
            if (nameVec[i].equals(contactName)){
                number = phoneNumberVec[i];
            }
            else{
                number = number;
            }
        }
        return number;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int numElements = 20;
        String[] names = new String[numElements];
        String[] phone = new String[numElements];
        int numPairs = input.nextInt();
        int index = 0;
        String cName;

        for (int i = 0; i < numPairs * 2; ++i) {
            if (i % 2 == 0) {
                names[index] = input.next();
                index += 1;
            } else {
                phone[index - 1] = input.next();
            }
        }
        cName = input.next();

        System.out.println(getPhoneNumber(names, phone, cName, numPairs));
    }
}
