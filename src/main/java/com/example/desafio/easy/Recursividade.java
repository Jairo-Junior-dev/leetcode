package com.example.desafio.easy;

public class Recursividade {
    public int mdc(int a, int b) {
        if (b == 0) return a;
        return mdc(b, a % b);
    }
    public int menorMultiploComun(int valorA, int valorB) {
        return (valorA * valorB) / mdc(valorA, valorB);
    }
    public int multiplosMMC(int ...valores){
        int resultado = valores[0];
        for (int valore : valores) {
            resultado = menorMultiploComun(resultado, valore);
        }
        return resultado;
    }

    public static void main(String[] args) {
        Recursividade recursividade = new Recursividade();
        System.out.println(recursividade.multiplosMMC(40,60));
        System.out.println(recursividade.mdc(40,60));
    }
}
