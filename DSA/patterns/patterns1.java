
import java.util.Scanner;

public class patterns1{
    public static void main(String[] args) {
        // pattern print of solid rectangle of length 5 and breath 4

        Scanner scn = new Scanner(System.in); 
        int n; 
        int m; 

        System.out.print("enter the number of rows: ");
        n = scn.nextInt();

        System.out.print("enter the number of colums: ");
        m = scn.nextInt();

        // outer loop   {for rows}
        for(int j=1; j<=n ; j++){
            // inner loops for columns 
            for (int i=1; i<=m ; i++) {
                System.out.print("*");                
            }
            System.out.println();
        }

    }
}
