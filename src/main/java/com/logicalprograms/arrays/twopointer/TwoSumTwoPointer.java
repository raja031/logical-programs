package com.logicalprograms.arrays.twopointer;

import java.util.Arrays;

/**
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class TwoSumTwoPointer {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] res = twoSum(nums, target);
        Arrays.stream(res).forEach(System.out::println);
    }

    private static int[] twoSum(int[] arr, int k) {
            int[][] nums=new int[arr.length][2];
            for(int i=0;i<arr.length;i++){
                nums[i][0]=arr[i];
                nums[i][1]=i;
            }
            Arrays.sort(nums,(a,b)->Integer.compare(a[0],b[0]));
            int left=0,right=nums.length-1;
            while(left<right){
                int sum=nums[left][0]+nums[right][0];
               if(sum==k){
                   return new int[]{nums[left][1], nums[right][1]};
               }else if(sum<k){
                   left++;
               }else{
                   right--;
               }
            }
        return new int[]{-1, -1};
    }
}
