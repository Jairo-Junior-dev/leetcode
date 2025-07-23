package com.example.desafio.easy;

public class TwoSum {
    public int[] twoSumSorted(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
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

    }

}
