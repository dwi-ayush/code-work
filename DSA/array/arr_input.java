import java.util.Scanner;

public class arr_input {
    public static void main(String args[]){
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the size of Array");
        int size = scn.nextInt();

        int Numbers[] = new int[size];

        //input of the array value 
        System.out.println("Enter the Value of Array");
        for(int i = 0; i<size ; i++){
            Numbers[i]=scn.nextInt();
        }

        // output of the array value 
        System.out.println("Your Array Values Are");
        for(int i=0; i<size; i++){
            System.out.println(Numbers[i]);
        }

    }
}
