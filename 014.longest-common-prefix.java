/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 *
 * https://leetcode.com/problems/longest-common-prefix/description/
 *
 * algorithms
 * Easy (33.23%)
 * Total Accepted:    438K
 * Total Submissions: 1.3M
 * Testcase Example:  '["flower","flow","flight"]'
 *
 * Write a function to find the longest common prefix string amongst an array
 * of strings.
 * 
 * If there is no common prefix, return an empty string "".
 * 
 * Example 1:
 * 
 * 
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * 
 * 
 * Note:
 * 
 * All given inputs are in lowercase letters a-z.
 * 
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String commonPre = "";
        try {
            for (int i = 0;; i++) {
                int flag = 0;
                char common = strs[0].charAt(i);
                for (String str : strs) {
                    if (str.charAt(i) != common) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    commonPre += common;
                } else {
                    break;
                }
            }
        } catch (IndexOutOfBoundsException e) {
            return commonPre;
        }
        return commonPre;
    }
}

