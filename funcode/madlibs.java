import java.util.Scanner;

public class madlibs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Input variables
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;
        
        // raw story 
        System.out.println("\n--- YOUR MADLIB STORY ---");
        System.out.println("TODAY I WENT TO A __adjective1 __ ZOO.");
        System.out.println("IN AN EXHIBIT I SAW A __ noun1__.");
        System.out.println("IT WAS __adjective2__ AND__verb1_! ");
        System.out.println("I WAS  __adjective3__ !");

        // Take input from user
        System.out.println("ENTER THE ADJECTIVE1: ");
        adjective1 = scn.nextLine();

        System.out.println("ENTER THE NOUN1: ");
        noun1 = scn.nextLine();

        System.out.println("ENTER THE ADJECTIVE2: ");
        adjective2 = scn.nextLine();

        System.out.println("ENTER THE VERB1: ");
        verb1 = scn.nextLine();

        System.out.println("ENTER THE ADJECTIVE3: ");
        adjective3 = scn.nextLine();

        // Final Story
        System.out.println("\n--- YOUR MADLIB STORY ---");
        System.out.println("TODAY I WENT TO A " + adjective1 + " ZOO.");
        System.out.println("IN AN EXHIBIT I SAW A " + noun1 + ".");
        System.out.println("IT WAS " + adjective2 + " AND " + verb1 + "!");
        System.out.println("I WAS " + adjective3 + "!");
    }
}
