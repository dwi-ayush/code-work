                                         //pattern 2 
import java.util.Scanner;
        // pattern printing of hallow rectangle 
public class pattern2{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n;
        int m;
        
        System.out.print("enter the number of rows: ");
        n = scn.nextInt();
        System.out.print("enter the number of colums ");
        m = scn.nextInt();

        //outer loop  which perform rows work 

        for(int i = 1; i<=n; i++){
            //inner loop
            for(int j=1; j<=m; j++){
                // cell -> (i,j)
                if(i==1 || j==1 || i==n || j==m ){
                    System.err.print("*");
                }
                else{
                    System.err.print(" ");
                }
            }
            System.err.println();
        }
    }  
}