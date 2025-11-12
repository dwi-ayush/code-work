import java.util.Scanner;

public class Average { // 1. Renamed class to start with Capital

    // 2. Changed return type to avoid integer division issues
    public static void averageOfNumbers(int a, int b, int c) {
        double z; 
        
        // 3. Usage of 3.0 forces Java to treat this as decimal division
        z = (a + b + c) / 3.0; 
        
        System.out.println("The average is: " + z);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a, b, c;

        System.out.println("Enter 3 numbers to find the average: ");
        a = scn.nextInt();
        b = scn.nextInt();
        c = scn.nextInt();

        averageOfNumbers(a, b, c); // Call the corrected method name

        scn.close();
    }
}