
public class Main {

    public static void main(String[] args) {
	// write your code here
        GuessingGame game1 = new GuessingGame();
        while(game1.startGame()){
            game1 = new GuessingGame();
            game1.startGame();
        }
        System.out.println("Thank you for playing Guessing Game, hope you enjoyed it!");
    }
}
