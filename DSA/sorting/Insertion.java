 import java.util.*;

public class Insertion{
    public static void main(String[] args){
        
        int arr[] ={7,8,3,1,2};

        //instertion sort 
        for(int i=1; i< arr.length; i++){
            int current = arr[i];   // <-- Initialize current here
            int j=i-1;
            while(j>=0 && current< arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            // placemnet of the element 
            arr[j+1] = current;
        }
        // diaply of the new  shorted array 
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}