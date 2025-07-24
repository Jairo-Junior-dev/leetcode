package com.example.desafio.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TrianguloDePascal {

    public static List<List<Integer>> gerarTrianguloDePascal(int n) {
        List<List<Integer>> triangulo = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> linha = new ArrayList<>();
            linha.add(1);
            //Relação de Stifel
            for (int j = 1; j < i; j++) {
                int valor = triangulo.get(i - 1).get(j - 1) + triangulo.get(i - 1).get(j);
                linha.add(valor);
            }
            if (i > 0) {
                linha.add(1);
            }
            triangulo.add(linha);
        }
        return triangulo;
    }
    public static int[][] gerarTriangulo(int linhas) {
        int[][] triangulo = new int[linhas][linhas];
        for (int i = 0; i < linhas; i++) {
            
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    triangulo[i][j] = 1;
                } else {
                    triangulo[i][j] = triangulo[i - 1][j - 1] + triangulo[i - 1][j];
                }
            }
        }

        return triangulo;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de linhas do Triângulo de Pascal: ");
        int n = scanner.nextInt();

        List<List<Integer>> resultado = gerarTrianguloDePascal(n);
        for (List<Integer> linha : resultado) {
            System.out.println(linha);
        }
        System.out.println(resultado);
        scanner.close();
    }

}
