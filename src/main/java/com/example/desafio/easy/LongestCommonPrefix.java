package com.example.desafio.easy;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String string = "";
        int minLength = Integer.MAX_VALUE;
        for (String s : strs) {
            if (s.length() < minLength) {
                minLength = s.length();
            }
        }
        for (int index = 0; index < minLength; index++) {
            char c = strs[0].charAt(index);
            boolean todosIguais = true;
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(index) != c) {
                    todosIguais = false;
                    break;
                }
            }

            if (todosIguais) {
                string += c;
            }
        }

        return string;
    }


    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new  String[]{"flower","flow","flight"}));
    }
}
