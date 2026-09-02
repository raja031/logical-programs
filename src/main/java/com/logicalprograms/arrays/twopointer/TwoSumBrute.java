package com.logicalprograms.arrays.twopointer;

import java.util.Arrays;

/**
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class TwoSumBrute {
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        int[] res = twoSum(nums, target);
        Arrays.stream(res).forEach(System.out::println);
    }

    private static int[] twoSum(int[] arr, int k) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==k){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
