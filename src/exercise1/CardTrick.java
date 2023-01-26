package exercise1;
import java.util.Scanner;
import java.util.Random;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Anreet Kaur, 25th January, 2023
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        
        Random random = new Random();
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(13)+1);
             
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
                    hand[i] = card;
        }

        // insert code to ask the user for Card value and suit, create their card
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your card : ");
            int value = sc.nextInt();
            
            System.out.print("Enter your card suit value: ");
            int suit = sc.nextInt();
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        Card user = new Card(value, Card.SUITS[suit-1]);
        // Then loop through the cards in the array to see if there's a match.
        for(int i = 0; i<hand.length; i++){
            if(hand[i] == user)
            {
                System.out.println("Congratulations! You guessed right.");
                printInfo();
            }
            else
            {
                System.out.println("Sorry, the current card is not the same as the user.");
            }
        }
        // If the guess is successful, print System.out.println("Congratulations, you guessed right!");.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Anreet Kaur, 25th January, 2022
     */
    private static void printInfo() {
        // I am done.
        System.out.println("Congratulations, you guessed right!");

        System.out.println("My name is Anreet Kaur.");
        
    
    }

}
