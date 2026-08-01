import java.util.*;
public class Selction{
    public static void main(String[] args){

        int arr[] ={ 56,9012,23,43,2,9,7,5,56};

        //selection sort 
        for(int i=0; i<arr.length-1; i++){
            int smallest = i;
            for( int j=i+1; j< arr.length; j++){// it start from i+1 kuki i pe ham waise bhi samllest push karne wale hai to use to compare karenge hi
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            //swap 
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp; 
        }
        
        //  using loop to print the array elements 
        for( int i =0 ; i <arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
