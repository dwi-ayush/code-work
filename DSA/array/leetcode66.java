// yeah vs code ka code hai 
 class leetcode66 {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length -1; i >= 0; i--){ // yeah loop case hai jab koi ek value 9 ho 
            if(digits[i] == 9){
                digits[i] = 0;
            }
            else{ // yeah tab jab koi bhi value 9 na ho 
                digits[i]++;
                return digits;
            }
        }
        digits = new int[digits.length+1]; // yeah case ham use kar rahe tab ke liye jab sari value 9 ho
        digits[0] =1;
        return digits;
    }
}
/*
====================== SUMMARY ======================

Approach:
1. Traverse the array from the last index.
2. If the current digit is not 9:
      -> Increment it by 1.
      -> Return immediately because no carry remains.
3. If the current digit is 9:
      -> Change it to 0.
      -> Continue moving left (carry).
4. If every digit is 9:
      -> Create a new array of size n + 1.
      -> Put 1 at index 0.
      -> Remaining elements are already 0.

Examples:
[1,2,3]  -> [1,2,4]
[1,2,9]  -> [1,3,0]
[9,9,9]  -> [1,0,0,0]

Time Complexity  : O(n)
Space Complexity : O(1)
Extra Space      : O(n) only when all digits are 9.

======================================================
*/