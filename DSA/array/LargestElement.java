import java.util.Scanner;

public class LargestElement {

    public static void main(String[] args) {

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

        // If  we assume max with 0 tab negative number ko  nji leta tab max ka  pata nhi chalta 
        // Assume the first element is the largest
        int max = matrix[0][0];
        // now this can work on the complete negative matrix also 

        // Traverse the matrix to find the largest element
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {

                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }

            }
        }

        // Print the largest element
        System.out.println("Largest element = " + max);

        scn.close();
    }
}