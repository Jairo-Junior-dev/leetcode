package com.example.desafio.easy;

public class RomanToInt {
    public int romanToInt(String s) {
        char[] romans = s.toCharArray();
        int total = 0;

        for (int i = 0; i < romans.length; i++) {
            int atual = code(romans[i]);
            if (i + 1 < romans.length && atual < code(romans[i + 1])) {
                total -= atual;
            } else {
                total += atual;
            }
        }
        return total;
    }
    public static int code(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

}
