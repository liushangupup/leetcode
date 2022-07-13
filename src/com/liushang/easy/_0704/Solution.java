package com.liushang.easy._0704;

import java.util.Arrays;

//二分查找(条件：数组是有序的)
public class Solution {

    //时间复杂度：O(log n)
    //空间复杂度：O(1)
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = (right + left) / 2;
            if (nums[middle] < target) {
                left = middle + 1;
            } else if (nums[middle] > target) {
                right = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    //递归解法
    public static int Midsearch(int left, int right, int[] nums, int target) {
        if (left > right) {
            return -1;
        }
        int middle = (right + left) / 2;
        if (nums[middle] < target) {
            return Midsearch(middle + 1, right, nums, target);
        } else if (nums[middle] > target) {
            return Midsearch(left, middle - 1, nums, target);
        } else {
            return middle;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12, 16};
        int target = 9;
        System.out.println(search(nums, target));
        System.out.println(Midsearch(0, nums.length - 1, nums, target));
    }
}
