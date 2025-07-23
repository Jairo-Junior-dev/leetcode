package com.example.desafio.easy;

public class PalindromeNumber {
    public boolean  isPalindrome(int value){
        if (value<= 0){
            System.out.println("O numero não pode ser negativo ou igual a zero");
            return false;
        }
        //right
        // Vou usar dois ponteiros uma para indicar o fim e outro o inicio
        String str = String.valueOf(value);
        int esquerda = 0;
        int direita = str.length() - 1;

        while (esquerda < direita) {
            if (str.charAt(esquerda) != str.charAt(direita)) {
                return false;
            }
            esquerda++;
            direita--;
        }

        return true;
    }

}
