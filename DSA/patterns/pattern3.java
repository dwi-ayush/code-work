                                    // half pyramid 
import java.util.Scanner;

public class pattern3{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int n ; // in this particular code we dont ned coluyms bcz it is a half pyramid 

        System.out.print("enter the number of rows ");
        n =  scn.nextInt();

        for( int i= 1 ; i<=n; i++){
            // innner loop 
            for( int j=1 ; j<=i ; j++){ // kuki jitne no of rows unte colums chaiye uss line me 
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}