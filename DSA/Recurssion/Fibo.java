
import java.util.Scanner;

public class Fibo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Print the nth Fibonacci number
        System.out.println("Fibonacci number: " + fibo(n));

        sc.close();
    }

    static int fibo(int n) {

        // Base condition: first two Fibonacci numbers are 0 and 1
        if (n < 2) {
            return n;
        }

        // Recursive call: add the previous two Fibonacci numbers
        return fibo(n - 1) + fibo(n - 2);
    }
}
