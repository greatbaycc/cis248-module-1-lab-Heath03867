import java.util.Scanner;

public class PlayerRoster {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] jersey = new int[5];
        int[] rating = new int[5];
        int index = 1;
        int pJersey;
        int pRating;
        int pNewJersey;
        char menuChoice ;

        for (int i = 0; i < 5; ++i){
           System.out.println("Enter player " + index + "'s jersey number:");
           jersey[i] = scnr.nextInt();
           System.out.println("Enter player " + index + "'s rating:");
           rating[i] = scnr.nextInt();
           index += 1;
           System.out.println("");
        }

        index = 1;
        System.out.println("ROSTER");

        for (int i = 0; i < 5; ++i){
            System.out.println("Player " + index + " -- Jersey number: " + jersey[i] +
            ", Rating: "  + rating[i]);

            index += 1;
        }

        System.out.println("");

        do {
            index = 1;
            System.out.println("MENU");
            System.out.println("u - Update player rating");
            System.out.println("a - Output players above a rating");
            System.out.println("r - Replace player");
            System.out.println("o - Output roster");
            System.out.println("q - Quit");
            System.out.println("");
            System.out.println("Choose an option:");

            menuChoice = scnr.next().charAt(0);

            if (menuChoice == 'o'){
                System.out.println("ROSTER");
                for (int i = 0; i < 5; ++i){
                    System.out.println("Player " + index + " -- Jersey number: " + jersey[i] +
                    ", Rating: " + rating[i]);

                    index += 1;
                }
                System.out.println("");
            }

            if (menuChoice == 'u'){
                System.out.println("Enter a jersey number:");
                pJersey = scnr.nextInt();
                System.out.println("Enter a new rating for player:");
                pRating = scnr.nextInt();

                for (int i = 0; i < 5; ++i){
                    if (pJersey == jersey[i]){
                        rating[i] = pRating;
                    }
                }
            }

            if (menuChoice == 'a'){
                System.out.println("Enter a rating:");
                pRating = scnr.nextInt();
                System.out.println("ABOVE " + pRating);

                for (int i = 0; i < 5; ++i){
                    if (rating[i] > pRating){
                        System.out.println("Player " + index + " -- Jersey number: " + jersey[i] + ", Rating: " +
                                rating[i]);
                    }
                    index += 1;
                }
                System.out.println("");
            }

            if (menuChoice == 'r'){
                index = 0;
                System.out.println("Enter a jersey number:");
                pJersey = scnr.nextInt();
                System.out.println("Enter a new jersey number:");
                pNewJersey = scnr.nextInt();
                System.out.println("Enter a rating for the new player:");
                pRating = scnr.nextInt();

                for (int i = 0; i < 5; ++i){
                    if(jersey[i] == pJersey){
                        jersey[i] = pNewJersey;
                        rating[i] = pRating;
                    }
                }
            }
        } while (menuChoice != 'q');
    }
}