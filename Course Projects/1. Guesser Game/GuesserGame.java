import java.util.Scanner;

class Guesser {
    int min = 0;
    int max = 0;
    protected int guessedNumber;

    protected int guessNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range (Min) : ");
        min = sc.nextInt();
        System.out.print("Enter Range (Max) : ");
        max = sc.nextInt();
        System.out.print("Guesser Kindly guess the number : ");
        guessedNumber = sc.nextInt();
        return guessedNumber;
    }
}

class Umpire {
    private int guessedNumber;
    protected int rangeMin;
    protected int rangeMax;

    protected int getGuessedNumber() {
        Guesser g = new Guesser();
        guessedNumber = g.guessNumber();
        rangeMin = g.min;
        rangeMax = g.max;
        System.out.println("Guesser has guessed the number and informed umpire...");
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
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Players : ");
        numOfPlayers = sc.nextInt();
        Player[] players = new Player[numOfPlayers];

        System.out.println("Guess Number between " + umpire.rangeMin + " and " + umpire.rangeMax);
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
    }
}