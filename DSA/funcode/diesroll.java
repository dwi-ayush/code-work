
import java.util.Random;
import java.util.Scanner;

public class  diesroll{
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        Random rnd = new Random();
        int numOfDice;
        int total = 0;
        System.out.print(" Enter the # of dice  to roll ");
        numOfDice = scn.nextInt(); 

        if(numOfDice > 0){
            for (int i = 0; i < numOfDice; i++){
                int roll = rnd.nextInt(1, 7);
                printDie(roll);
                System.out.println("you rolled : " + roll);
                total += roll;
                 
            }
            System.out.println(" total rolled dice " + total );
        }
        else {
            System.out.println(" # of dice must be greater than  0 ");
        }
        
        
    }
        static void printDie(int roll){

    String dice1 ="""
                 -------
                |       |
                |   1   |
                |       |
                 -------
                     """;   

    String dice2 ="""
                 -------
                |       |
                |   2   |
                |       |
                 -------
                 """;                         
    String dice3 ="""
                 -------
                |       |
                |   3   |
                |       |
                 -------
                 """; 
    String dice4 ="""
                 -------
                |       |
                |   4   |
                |       |
                 -------
                 """;                  
    String dice5 ="""
                 -------
                |       |
                |   5   |
                |       |
                 -------
                 """; 
    String dice6 ="""
                 -------
                |       |
                |   6   |
                |       |
                 -------
                 """;   
    switch(roll){
        case 1 -> System.out.print(dice1);
        case 2 -> System.out.print(dice2);
        case 3 -> System.out.print(dice3);
        case 4 -> System.out.print(dice4);
        case 5 -> System.out.print(dice5);
        case 6 -> System.out.print(dice6);
        default -> System.out.println("invalid row");
    }                                    
    }

}