import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        char newGameIp;boolean newGame = true;
        GuessingGame game1 = new GuessingGame();
        GuessingGame.GameResult gameResult;
        while(newGame){
            game1.initializeGame();
            game1.playGame();
            gameResult = game1.getGameResult();
            if(gameResult.userWon) {
                System.out.println("Hurray! You guessed it correctly in: " + (11-gameResult.remGuesses) + "chances.");
            }
            else
                System.out.println("Oops! You lost, the chosen number is: " + gameResult.chosenNumber +".");
            //check for new game request
            System.out.println("Do you want to play a new game? Y/N");
            newGameIp = scanner.next().charAt(0);
            if(newGameIp == 'y' || newGameIp == 'Y') {
                newGame = true;
            }
            else
                newGame = false;
        }

    }
}