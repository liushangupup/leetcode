package com.liushang.easy._0035;

import javax.swing.text.html.HTML;
import java.util.Arrays;

//搜索插入位置(条件：数组是有序的)
public class Solution {

    //时间复杂度：O(log n)
    //空间复杂度：O(1)
    public static int search(int[] nums, int target) {
        int left = 0;
        int ans = nums.length - 1;
        int right = ans;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] >= target) {
                right = middle - 1;
                ans = middle;
            } else {
                left = middle + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12, 16};
        int target = 9;
        System.out.println(search(nums, target));
    }
}
