package com.liushang.easy._0001;

import java.util.Arrays;

//两数之和
public class Solution {

    //暴力法
    public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        int target = 4;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
