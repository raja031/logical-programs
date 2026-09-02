package com.logicalprograms.arrays.bestTimeToSell;

public class BestTimeToSell {
    public static void main(String[] args) {
        int[] nums = {7,6,4,3,1};
         int res=bestTimeToSellStock(nums);
        System.out.println(res);
    }
    private static int bestTimeToSellStock(int[] arr){
        int min=arr[0],profilt=0;
        for(int i=0;i<arr.length;i++){
            int cost=arr[i]-min;
            profilt=Math.max(profilt,cost);
            min=Math.min(min,arr[i]);
        }
        return profilt;
    }
}
