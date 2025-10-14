
import java.util.Scanner;

public class matrixmaking{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int rows;
        int colums;
        char character;

        System.out.print("enter the number of rows ");
        rows = scn.nextInt();
        System.out.print("enter the number of colums ");
        colums = scn.nextInt();
        System.out.print("enter up the character you want to diplay ");
        character = scn.next().charAt(0);
        int i;
        for (i = 0 ; i < rows  ; i++) {
            int j;
            for( j = 0 ; j < colums ; j++){
                System.out.print(character);
            }
            System.out.println(" ");
        }
    scn.close();

    }
}