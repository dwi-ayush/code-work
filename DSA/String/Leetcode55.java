import java.util.Scanner;

public class Leetcode55 {

    // Function to check whether we can reach the last index
    public static boolean canJump(int[] nums) {
        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {

            // If current index is beyond the farthest reachable index,
            // then we cannot move further.
            if (i > maxReach) {
                return false;
            }

            // Update the farthest reachable index.
            maxReach = Math.max(maxReach, i + nums[i]);

            // If we can reach or cross the last index,
            // return true immediately.
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Display result
        if (canJump(nums)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}