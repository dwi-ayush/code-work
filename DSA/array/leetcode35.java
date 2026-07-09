import java.util.Scanner;

public class leetcode35 {

    /*
     * Function: searchInsert()
     * ------------------------
     * Finds the index of the target if it exists.
     * Otherwise, returns the index where the target
     * should be inserted to keep the array sorted.
     *
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
    public static int searchInsert(int[] nums, int target) {

        // Starting index of the array
        int low = 0;

        // Ending index of the array
        int high = nums.length - 1;

        // Continue searching until the search space becomes empty
        while (low <= high) {

            // Calculate the middle index
            // This formula prevents integer overflow
            int mid = low + (high - low) / 2;

            // Target found
            if (nums[mid] == target) {
                return mid;
            }

            // Target is smaller than middle element
            // Search in the left half
            else if (target < nums[mid]) {
                high = mid - 1;
            }

            // Target is greater than middle element
            // Search in the right half
            else {
                low = mid + 1;
            }
        }

        /*
         * If the loop ends, the target is not present.
         *
         * At this point:
         * - All elements before 'low' are smaller than the target.
         * - All elements from 'low' onward are greater than the target.
         *
         * Therefore, 'low' is the correct insertion position.
         */
        return low;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the size of the sorted array
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
        int result = searchInsert(nums, target);

        // Display the result
        System.out.println("Search Insert Position: " + result);

        // Close the Scanner to prevent resource leaks
        sc.close();
    }
}