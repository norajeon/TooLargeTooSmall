/**
 * Created by iyasuwatts on 10/17/17.
 */
 import java.sql.SQLOutput;
 import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        int attempts = 1;
        int prevNumber = 0;
        int randomNumber = (int) ((Math.round(Math.random()* 100)));
      //System.out.println(randomNumber);
        boolean hasGuessedYet = false;
       for (int i = 1; i < 20; i++) {
           Scanner userInput = new Scanner(System.in);
           System.out.println("Guess a number between 0 and 100");
           Integer userNumber = userInput.nextInt();
           ;

           if (hasGuessedYet == true && prevNumber == userNumber) {
               System.out.println("Please guess another number");
               attempts--;
           }
           else if (userNumber > randomNumber) {
               System.out.println("Value is too large. This is attempt #" + attempts);

           } else if (userNumber < randomNumber) {
               System.out.println("Value is too small. This is attempt #" + attempts);

           } else if (userNumber == randomNumber) {
               System.out.println("This is the correct guess. You attempted #" + attempts + " guesses.");
               break;
           } else {
               System.out.println("Invalid. Try again.");
               attempts--;
           }
           hasGuessedYet = true;
           prevNumber = userNumber;
           attempts++;


   }


    }
}
