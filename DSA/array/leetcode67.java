public class leetcode67 {

    // This method takes two binary strings and returns their binary sum.
    public static String addBinary(String a, String b) {

        // i points to the last character of string a.
        // We start from the end because binary addition happens from right to left.
        int i = a.length() - 1;

        // j points to the last character of string b.
        int j = b.length() - 1;

        // carry stores the carry generated during binary addition.
        // Initially there is no carry, so it is 0.
        int carry = 0;
        
        // StringBuilder is used because Strings are immutable in Java.
        // Appending to StringBuilder is much faster than repeatedly using String.
        StringBuilder ans = new StringBuilder();

        // Continue the loop while:
        // 1. There are digits left in string a
        // 2. OR there are digits left in string b
        // 3. OR a carry is still remaining
        while (i >= 0 || j >= 0 || carry != 0) {

            // Start the sum with the carry from the previous addition.
            int sum = carry;

            // If string a still has a digit left
            if (i >= 0) {

                // charAt(i) returns a character ('0' or '1').
                // Subtracting '0' converts it into an integer (0 or 1).
                //
                // Example:
                // '1' - '0' = 1
                // '0' - '0' = 0
                sum += a.charAt(i) - '0';

                // Move to the next digit on the left.
                i--;
            }

            // If string b still has a digit left
            if (j >= 0) {

                // Convert character to integer and add it to sum.
                sum += b.charAt(j) - '0';

                // Move one position left.
                j--;
            }

            // Store the current answer bit.
            //
            // Why sum % 2?
            //
            // sum = 0 -> answer bit = 0
            // sum = 1 -> answer bit = 1
            // sum = 2 -> answer bit = 0
            // sum = 3 -> answer bit = 1
            ans.append(sum % 2);

            // Calculate the carry for the next iteration.
            //
            // sum = 0 -> carry = 0
            // sum = 1 -> carry = 0
            // sum = 2 -> carry = 1
            // sum = 3 -> carry = 1
            carry = sum / 2;
        }

        // We built the answer from right to left.
        // Example:
        //
        // Correct Answer : 10101
        // Stored As      : 10101 (reverse order of creation)
        //
        // reverse() fixes the order.
        //
        // toString() converts StringBuilder into String.
        return ans.reverse().toString();
    }

    public static void main(String[] args) {

        // Sample Input
        String a = "1010";
        String b = "1011";

        // Call the function
        String result = addBinary(a, b);

        // Print the final answer
        System.out.println("Binary Sum = " + result);
    }
}