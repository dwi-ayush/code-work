
import java.util.Scanner;

// ternary operator '?'= Return 1 and 2 value if a true contain is true or false 
// it is a alternative of if loop  
// variable = (condition) ? ifTrue : if False ;

//code example 
 public class ternaryoperator{
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
        int hour;
        System.out.print("enter the time in 24 h format");
        hour = scn.nextInt();
        String timeOfday = (hour < 12) ? " AM" : " PM" ;
        System.out.println(timeOfday);
    }
 }