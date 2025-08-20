
import java.util.Scanner;

public class madlibs{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.println("TODAY I WANT TO A:_ADJECTIVE1_: ZOO  ");
        System.out.println("IN AN EXHIBIT I SAW A:_NOUN1_:   ");
        System.out.println(" WAS :_ADJECTIVE2_: AND :_VERB1_: !");
        System.out.println("I WAS :_ADJECTIVE3_: !");

        System.out.println(" ENTER THE adjective1 ");
        String ajective1 = scn.nextLine();
        System.out.println(" ENTER THE NOUN1 ");
         noun1 = scn.nextLine();
        System.out.println(" ENTER THE adjective2 ");
        String ajective2 = scn.nextLine();
        System.out.println(" ENTER THE VERB1 ");
         verb1 = scn.nextLine();
        System.out.println(" ENTER THE adjective3 ");
        String ajective3 = scn.nextLine();


        System.out.println("TODAY I WANT TO "+ adjective1 _+: " ZOO  ");
        System.out.println("IN AN EXHIBIT I SAW A " + noun1 +".");
        System.out.println(" WAS" + adjective2 + " and" +_adjective2 + "!");
         System.out.println("I WAS" + adjective2 + "!");



    }
}