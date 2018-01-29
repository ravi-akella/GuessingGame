import java.util.Scanner;


public class GuessingGame {
    int randomNumber;
    int remGuesses;
    private GameResult gameResult = new GameResult();

    void initializeGame(){
        //initialize game
        System.out.println("Welcome to Guessing Game, starting new Game! In this game, you have 10 chances to guess a number that I-the computer has chosen b/w 1-100\n");
        randomNumber = (int ) (Math.random()*100 + 1);
        remGuesses = 10;

    }

    //method getResult
    GameResult getGameResult() {
        return gameResult;

    }
    public class GameResult {
        boolean userWon;
        int remGuesses;
        int chosenNumber;
        boolean gameStatus;


        GameResult() {
            userWon = false;
            remGuesses = 10;

        }
    }

    Scanner scanner = new Scanner(System.in);

    //method to start game; illustrating how private class GameResult variables are set using playGame() method only and not exposed outside
    void playGame() {
        int userGuess;
        try {
            for (remGuesses = 10; remGuesses > 0; remGuesses--) {
                System.out.println("You have " + remGuesses + " remaining. Enter your guess\n");
                userGuess = scanner.nextInt();

                if (userGuess > randomNumber) {
                    System.out.println("Its less than " + userGuess + ".");
                } else if (userGuess < randomNumber) {
                    System.out.println("Its more than " + userGuess + ".");
                } else {
                    this.gameResult.userWon = true;
                    break;
                }
            }
            this.gameResult.gameStatus = true;
            this.gameResult.remGuesses = remGuesses;
            this.gameResult.chosenNumber = randomNumber;
        }
        catch(Exception e) {
            System.out.println("Error in executing game");
            this.gameResult.gameStatus = false;
        }
    }
}



