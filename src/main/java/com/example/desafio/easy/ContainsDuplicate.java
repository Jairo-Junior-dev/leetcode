package com.example.desafio.easy;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        int size = nums.length;
        for (int i = 0; i < size - 1 ; i++) {
            for (int j = i + 1; j  < size ; j++) {
                System.out.println(nums[i] + " ++++ "+  nums[j]);
                if (nums[j] == nums[i]){
                    //System.out.println(nums[i] + " ++++ "+  nums[j]);
                    return true;
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,4,5,5}));
    }
}
