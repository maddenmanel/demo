//Given an integer x, return true if x is a palindrome, and false otherwise.
//
//
// Example 1:
//
//
//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.
//
//
// Example 2:
//
//
//Input: x = -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it
//becomes 121-. Therefore it is not a palindrome.
//
//
// Example 3:
//
//
//Input: x = 10
//Output: false
//Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
//
//
//
// Constraints:
//
//
// -2³¹ <= x <= 2³¹ - 1
//
//
//
//Follow up: Could you solve it without converting the integer to a string?
//
// Related Topics Math 👍 13372 👎 2786


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reversed = 0;
        int original = x;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            reversed = reversed * 10 + digit;
        }
        return original == reversed;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
