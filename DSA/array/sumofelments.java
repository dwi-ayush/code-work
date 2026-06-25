import java.util.Scanner;

public class sumofelements {
    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter the number of rows: ");
        int row = scn.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scn.nextInt();

        // Create the matrix
        int[][] matrix = new int[row][columns];

        // Input matrix elements
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scn.nextInt();
            }
        }

        // Variable to store the sum
        int sum = 0;

        // mostly operation are done using nested loop in the patterns of input ooutput 
        // Calculate the sum of all elements 
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                sum = sum + matrix[i][j];
            }
        }

        // Print the result
        System.out.println("Sum of all elements = " + sum);

        scn.close();
    }
}