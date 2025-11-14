                // code to find the factorial of the given number 
                    
import java.util.Scanner;

public class Factorial {
    
    public static void printFactorial(int n) {
        // Check for negative value
        if (n < 0) {
            System.out.println("Invalid Input!");
            return;
        }

        // Use 'long' to handle larger numbers (up to 20!)
        long factorial = 1; 

        // Loop to calculate factorial
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }

        System.out.println("The factorial of " + n + " is:");
        // Changed err to out
        System.out.println(factorial); 
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int n = scn.nextInt();

        // Calling function 
        printFactorial(n);
        
        // Close the scanner to prevent resource leaks
        scn.close(); 
    }
}