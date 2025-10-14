import java.util.Scanner;

public class arr_srch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] number; 
        int target;
        int size;
        boolean isFound = false;

        System.out.print("Enter the size of the array: ");
        size = scn.nextInt();

        number = new int[size];  // ✅ allocate memory for array

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": "); // it wil take the value by assiging it      
            number[i] = scn.nextInt();
        }

        System.out.print("Enter the target value: ");
        target = scn.nextInt();

        for (int i = 0; i < number.length; i++) {
            if (target == number[i]) {
                System.out.println("Element found at index " + i + "!");
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Element not found in the array.");
        }

        scn.close();
    }
}
