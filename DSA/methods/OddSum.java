import java.util.Scanner;

public class OddSum { // Class name PascalCase

    // Method name camelCase
    public static void sumOfOdd(int n) {
        int sum = 0;

        // OPTIMIZATION: Start at 1, increment by 2. 
        // No need for 'if' condition.
        for (int i = 1; i <= n; i += 2) {
            sum = sum + i;
        }
        
        System.out.println("The sum of odd numbers is: " + sum);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n;

        System.out.print("Enter the value of n: ");
        n = scn.nextInt();

        sumOfOdd(n);
        
        scn.close(); // Good practice to close the scanner
    }
}