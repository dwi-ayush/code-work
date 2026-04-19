import java.util.Random;
import java.util.Scanner;

public class rockpapergame {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain;

        do {
            // 🔹 Take valid input
            while (true) {
                System.out.print("Enter your move (rock, paper, scissors): ");
                playerChoice = scn.nextLine().trim().toLowerCase();

                if (playerChoice.equals("rock") ||
                    playerChoice.equals("paper") ||
                    playerChoice.equals("scissors")) {
                    break;
                } else {
                    System.out.println("Invalid choice! Try again.");
                }
            }

            // 🔹 Computer choice
            computerChoice = choices[rnd.nextInt(3)];
            System.out.println("Computer's choice: " + computerChoice);

            // 🔹 Game logic
            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if (
                (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                (playerChoice.equals("scissors") && computerChoice.equals("paper")) ||
                (playerChoice.equals("rock") && computerChoice.equals("scissors"))
            ) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            // 🔹 Ask to play again safely
            while (true) {
                System.out.print("Do you want to play again (yes/no): ");
                playAgain = scn.nextLine().trim().toLowerCase();

                if (playAgain.equals("yes") || playAgain.equals("no")) {
                    break;
                } else {
                    System.out.println("Please enter only 'yes' or 'no'.");
                }
            }

        } while (playAgain.equals("yes"));

        System.out.println("Thanks for playing!");
        scn.close();
    }
}