package com.logicalprograms.arrays.twopointer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class TwoSumOptimize {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] res = twoSum(nums, target);
        Arrays.stream(res).forEach(System.out::println);
    }

    private static int[] twoSum(int[] arr, int k) {
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int requiredSum=k-arr[i];
            if(map.containsKey(requiredSum)){
                return new int[]{map.get(requiredSum),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1, -1};
    }
}
