package com.logicalprograms.arrays.duplicates;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateBrut {
    public static void main(String[] args) {
        int[] nums = {3, 1};
//        boolean res = duplicateCheck(nums);
//        boolean res = duplicateCheckUsingHash(nums);
        boolean res = duplicateCheckusingArraySort(nums);
        System.out.println(res);
    }

    private static boolean duplicateCheck(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean duplicateCheckUsingHash(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(!set.add(nums[i])){
                return true;
            }
        }
        return false;
    }

    private static boolean duplicateCheckusingArraySort(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
                if (nums[i] == nums[i-1]) {
                    return true;
            }
        }
        return false;
    }
}
