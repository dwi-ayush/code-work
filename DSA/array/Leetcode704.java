import java.util.Scanner;

public class Leetcode704 {

    /*
     * Function: search()
     * ------------------
     * Searches for the target element in a sorted array using Binary Search.
     *
     * Returns:
     * - Index of the target if found.
     * - -1 if the target is not present.
     *
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
    public static int search(int[] nums, int target) {

        // First index of the array
        int low = 0;

        // Last index of the array
        int high = nums.length - 1;

        // Continue searching while the search space exists
        while (low <= high) {

            /*
             * Find the middle index.
             * This formula prevents integer overflow.
             */
            int mid = low + (high - low) / 2;

            // If the middle element is the target, return its index
            if (nums[mid] == target) {
                return mid;
            }

            // If the target is smaller, ignore the right half
            else if (target < nums[mid]) {
                high = mid - 1;
            }

            // If the target is greater, ignore the left half
            else {
                low = mid + 1;
            }
        }

        // Target not found
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Create the array
        int[] nums = new int[n];

        // Read the array elements
        System.out.println("Enter the sorted array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Read the target value
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();

        // Call the Binary Search function
        int result = search(nums, target);

        // Display the result
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found.");
        }

        // Close the Scanner object
        sc.close();
    }
}