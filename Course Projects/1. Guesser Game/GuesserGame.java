import java.util.Scanner;

class Guesser {
    protected int guessNumber() {
        int min = 0;
        int max = 10;
        int guessedNumber = (int) (Math.random() * (max - min + 1) + min);
        return guessedNumber;
    }
}

class Umpire {
    private int guessedNumber;

    protected int getGuessedNumber() {
        Guesser g = new Guesser();
        guessedNumber = g.guessNumber();
        System.out.println("Guesses has guessed the number and informed umpire...");
        return guessedNumber;
    }

    protected boolean checkGuess(int playerGuessedNumber) {
        return playerGuessedNumber == guessedNumber;
    }
}

class Player {
    private int playerGuessedNumber;

    protected void attemptGuess() {
        Scanner sc = new Scanner(System.in);
        playerGuessedNumber = sc.nextInt();
    }

    protected int getPlayerGuessedNumber() {
        return playerGuessedNumber;
    }
}

public class GuesserGame {
    public static void main(String[] args) {
        int numOfPlayers;
        boolean hasWon = false;
        Umpire umpire = new Umpire();
        System.out.println("Umpire Guessed Number " + umpire.getGuessedNumber());
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Players : ");
        numOfPlayers = sc.nextInt();
        Player[] players = new Player[numOfPlayers];
        for (int i = 0; i < numOfPlayers; i++) {
            players[i] = new Player();
            System.out.print("Enter Guess by Player " + (i + 1) + " : ");
            players[i].attemptGuess();
        }

        for (int i = 0; i < numOfPlayers; i++) {
            if (umpire.checkGuess(players[i].getPlayerGuessedNumber())) {
                System.out.println("Player " + (i + 1) + " Won ");
                hasWon = true;
            }
        }
        if (!hasWon) {
            System.out.println("Game Lost Please Try Again");
        }
        sc.close();
    }
}