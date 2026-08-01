public class Bubble{
    public static void main(String[] args){

        int arr[] ={71,45,74,4,5,8};

        for( int i =0 ; i< arr.length -1; i++){
            for ( int j= 0 ; j< arr.length - i- 1; j++){
                if (arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        //  using loop to print the array elements 
        for( int i =0 ; i <arr.length; i++){
            System.out.println(arr[i] + " ");
        }

    }
}