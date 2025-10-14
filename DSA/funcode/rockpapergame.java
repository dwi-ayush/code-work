
import java.util.Random;
import java.util.Scanner;
public class rockpapergame{
    public static void main(String[] args) {
        // rock paper game 

            Scanner scn = new Scanner(System.in);

            Random rnd = new Random();  

            String[] choice = {"rock", "paper","scissors"};
            String playerChoice;
            String computerchoice;
            String playagain ="yes";

            
        do{
            System.out.print("enter your move (rock, paper , scissor):-");
            playerChoice = scn.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissor")) {
               System.out.println("Invalid Choice !!"); 
                continue;
            }
            
            computerchoice = choice[rnd.nextInt(3)];
            System.out.println("Computer Choice:  " + computerchoice);

            if(playerChoice.equals(computerchoice)) {
                System.out.println("ITs a tie!");
            }
            else if((playerChoice.equals("paper") && computerchoice.equals("rock"))||
                    (playerChoice.equals("scissor") && computerchoice.equals("paper"))||
                    (playerChoice.equals("rock") && computerchoice.equals("scissor"))){
                System.out.println("YOU WIN!"); // we can also do it by else if loop 
            }
            else{
                System.out.println("YOU LOSE!");
            } 
        System.out.print(" Do You Want to play again(yers/no): ");
        playagain = scn.nextLine();
        }
        while(playagain.equals("yes"));

        System.out.println("thank for playing");

    }
}
