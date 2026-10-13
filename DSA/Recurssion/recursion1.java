// code to print Numbers from 5 to 1 using recursion function  

public class recursion1{    
    public static void printNumb(int n){
        if(n==0){
            return; // this is the base case  of the recursion function
        }
        System.out.println(n);
        printNumb(n-1);
    } 
    public static void main(String[] args){
        int n =5;
        printNumb(n); // with the value of 5
    }
}                         
  