
import java.util.Random;
import java.util.Scanner;

public class gessingno{
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scn = new Scanner(System.in);

        // decalrtion of the variable 
        System.out.println("hello wellcome to number gessing game ");
        
        int guess ;
        int attempt = 0;
        int min;
        int max;
        
        System.out.print("enter you minmum number ");
        min = scn.nextInt();
        System.out.print("enter you maximum number ");
        max = scn.nextInt();
        
        
        int randomnumber = random.nextInt(min , max+1);

        System.out.printf("Guess the number between %d - %d \n", min , max);
        do { 
            System.out.println("enter the guess");
            guess = scn.nextInt();
            attempt++;
            if (guess < randomnumber) {
                System.out.println("TWO LOW !!! Try Again");
            } 
            else if(guess > randomnumber){
            System.out.println("TWO HIGH !! Try again");
            }

            else {
                System.out.println("CORRECT ! The number was " + randomnumber);

                System.out.println("# of attempts" + attempt);
            }

        } while (randomnumber != guess );



    }
}