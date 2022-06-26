package com.liushang.easy._0001;

import java.util.Arrays;
import java.util.HashMap;

//两数之和
public class Solution1 {

    //哈希表
    //时间复杂度：O(N)
    //空间复杂度：O(N)
    public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                return new int[]{i,hashMap.get(target-nums[i])};
            }
            hashMap.put(nums[i],i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        int target = 4;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
