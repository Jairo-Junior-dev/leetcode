package com.example.desafio.easy;

import java.util.Arrays;

public class PlusOne {
    // Primeiro teste aceito
    public static int[] plusOne(int[] digits) {

        for (int i = digits.length -1; i >= 0; i--) {
            // Imaginamos que o ultimo numero seja 4
            if (digits[i] != 9) {
                // ele incrementa o ultimo numero;
                // ou seja 4 + 1 = 5
                digits[i]++;
                // retornando o digito
                return digits;
            }
            digits[i] = 0;

        }
        // ele aumenta o array para + 1 sendo que o index 0 recebe o valor um
        int[] novoNumero = new int[digits.length + 1];
        //ezzy
        novoNumero[0] = 1;
        return novoNumero;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(PlusOne.plusOne(new int[]{9, 9 , 9})));
    }
}