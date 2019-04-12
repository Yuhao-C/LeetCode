import java.util.LinkedList;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 *
 * https://leetcode.com/problems/valid-parentheses/description/
 *
 * algorithms
 * Easy (36.20%)
 * Total Accepted:    555.5K
 * Total Submissions: 1.5M
 * Testcase Example:  '"()"'
 *
 * Given a string containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * An input string is valid if:
 * 
 * 
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * 
 * 
 * Note that an empty string is also considered valid.
 * 
 * Example 1:
 * 
 * 
 * Input: "()"
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: "()[]{}"
 * Output: true
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: "(]"
 * Output: false
 * 
 * 
 * Example 4:
 * 
 * 
 * Input: "([)]"
 * Output: false
 * 
 * 
 * Example 5:
 * 
 * 
 * Input: "{[]}"
 * Output: true
 * 
 * 
 */
class Solution {
    public boolean isValid(String s) {
        if (s.isEmpty()) return true;
        LinkedList<Character> list = new LinkedList<>();
        list.add('q');
        char[] charList = s.toCharArray();
        list.add(charList[0]);
        for (int i = 1; i < charList.length; i++) {
            char current = charList[i];
            if ((current == ')' && list.peekLast() == '(') || (current == ']' && list.peekLast() == '[') || (current == '}' && list.peekLast() == '{')) {
                list.removeLast();
            } else {
                list.add(current);
            }
        }
        return (list.get(0) == 'q' && list.size() == 1);
    }
}

