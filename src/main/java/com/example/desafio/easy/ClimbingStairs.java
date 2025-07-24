package com.example.desafio.easy;

public class ClimbingStairs {

    public static int climbStairs(int n) {
        int[]cs = new int[n+1];
        cs[0] = 1;
        cs[1] = 1;
        for (int i = 2; i <= n  ; i++) {
            cs[i] = cs[i-1] + cs[i-2];
        }
        return cs[n];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}
