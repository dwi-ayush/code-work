import java.util.Scanner;

public class printTwo {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the Number of Rows O Balama");
        int row =  scn.nextInt();
        System.out.println("Enter the Number of Colums O Balma");
        int colum =  scn.nextInt();
     
        int[][] numbers = new int[row][colum];
         
        // input 
        //rows 
        for(int i = 0; i<row; i++){
            //colums 
            for( int j = 0; j< colum; j++){
               numbers[i][j] = scn.nextInt();
            }
        }
        //output 
        //rows 
        for(int i=0; i<row; i++){
            //colums 
            for(int j=0; j<colum ; j++){
                System.out.print(numbers[i][j] +" ");
            }
            System.out.println();
        }

    }
}

 
       
