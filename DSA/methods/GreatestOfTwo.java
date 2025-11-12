import java.util.Scanner;

public class GreatestOfTwo {

    public static void findGreatest(int a, int b) {

        if (a > b) {
            // Print the value of 'a', not just the letter 'a'
            System.out.println(a + " is greater than " + b);
        } 
        else if (b > a) {
            System.out.println(b + " is greater than " + a);
        } 
        else {
            // This handles the case where a == b
            System.out.println("Both numbers are equal.");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a, b;

        System.out.print("Enter the first number: ");
        a = scn.nextInt();
        System.out.print("Enter the second number: ");
        b = scn.nextInt();

        findGreatest(a, b);

        scn.close();
    }
}