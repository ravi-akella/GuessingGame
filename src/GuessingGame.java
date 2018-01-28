
import java.util.Scanner;

public class GuessingGame {
    int randomNumber;
    int remGuesses;
    //constructor
    GuessingGame(){
        //initialize game
        System.out.println("Welcome to Guessing Game, starting new Game! In this game, you have 10 chances to guess a number that I-the computer has chosen b/w 1-100\n");
        randomNumber = (int ) (Math.random()*100 + 1);
        remGuesses = 10;

    }
    public class GameResult {
        boolean userWon;
        int remGuesses;
        int chosenNumber;

        GameResult() {
            userWon = false;
            remGuesses = 10;

        }
    }

    GameResult gameResult = new GameResult();
    Scanner scanner = new Scanner(System.in);

    //method to start game; illustrating how private class GameResult variables are set using playGame() method only and not exposed outside
    GameResult playGame(){
        int userGuess;
        for(remGuesses=10;remGuesses>0;remGuesses--) {
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
        this.gameResult.remGuesses = remGuesses;
        this.gameResult.chosenNumber = randomNumber;

        return this.gameResult;
        }

        boolean startGame(){
        char newGameIp;
        boolean newGame;
        playGame();
        if(this.gameResult.userWon) {
            System.out.println("Hurray! You guessed it correctly in: " + (11-this.gameResult.remGuesses) + "chances.");
        }
        else
            System.out.println("Oops! You lost, the chosen number is: " + this.gameResult.chosenNumber +".");
        System.out.println("Do you want to play a new game? Y/N");
        newGameIp = scanner.next().charAt(0);
        if(newGameIp == 'y' || newGameIp == 'Y') {
            newGame = true;
        }
        else
            newGame = false;
        return newGame;
        }




    }



