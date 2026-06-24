import java.util.Scanner;
public class searchInTwoD{
    public static void main(String args[]){

        Scanner scn = new Scanner(System.in);

        System.out.print("enter the number of rows ");
        int row = scn.nextInt();
        System.out.print("enter the number of Colums ");
        int colums = scn.nextInt();

        int [][] numbers = new int[row][colums];

        System.out.print(" Enter the Value u want to search in the array! "+ " ");
        int x = scn.nextInt();

        // taking input of the data
        // rows input 
        for(int i=0;  i<row; i++){
            //colums input 
            for(int j=0; j<colums; j++){
                numbers[i][j] = scn.nextInt();
            }
        }
        
        boolean found = false;

        // now using the SAME nested loop method we will do traversing of the  all the input elemnets 

        for(int i=0;  i<row; i++){
          for(int j=0; j<colums; j++){
            // compare all the elements with ' X '
            if(numbers[i][j] == x){
                System.out.println("X  Number found at location("+ i + " , "+ j + ")");
                found = true;
          }   
        }
        if(!found){
            System.out.println("Number not found");
        }

    }
}
}