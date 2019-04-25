import java.util.Arrays;

/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx1 = 0;
        int idx2 = 0;
        int[] result = new int[m + n];
        int ret_idx = 0;
        for (int i = 0; i < m + n; i++) {
            int num1 = idx1 >= m ? Integer.MAX_VALUE : nums1[idx1];
            int num2 = idx2 >= n ? Integer.MAX_VALUE : nums2[idx2];
            if (num1 < num2) {
                result[ret_idx++] = num1;
                idx1++;
            } else {
                result[ret_idx++] = num2;
                idx2++;
            }
        }
        for (int i = 0; i < m + n; i++) {
            nums1[i] = result[i];
        }
    }
}

