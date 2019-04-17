/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 *
 * https://leetcode.com/problems/add-binary/description/
 *
 * algorithms
 * Easy (38.61%)
 * Total Accepted:    291.3K
 * Total Submissions: 754.5K
 * Testcase Example:  '"11"\n"1"'
 *
 * Given two binary strings, return their sum (also a binary string).
 * 
 * The input strings are both non-empty and contains only characters 1 or 0.
 * 
 * Example 1:
 * 
 * 
 * Input: a = "11", b = "1"
 * Output: "100"
 * 
 * Example 2:
 * 
 * 
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 * 
 */
class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = a.length()-1, j = b.length()-1;  i >= 0 || j>= 0 || carry == 1; i--, j--) {
            int digit1 = i >= 0 ? Character.getNumericValue(a.charAt(i)) : 0;
            int digit2 = j >= 0 ? Character.getNumericValue(b.charAt(j)) : 0;
            int sum = digit1 + digit2 + carry;
            if (sum >= 2) {
                sum -= 2;
                carry = 1;
            } else {
                carry = 0;
            }
            sb.insert(0, sum);
        }
        return sb.toString();
    }
}

