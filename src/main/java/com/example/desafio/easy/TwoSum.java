package com.example.desafio.easy;

import java.util.Arrays;

public class TwoSum {

    public int[] twoSumSorted(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        //Busca Binaria
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[] {left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2,3,4,5,9,3};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(new TwoSum().twoSumSorted(nums, 11)));
    }

}
