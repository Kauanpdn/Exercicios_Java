package ArraysColecoes.ArraysUnidimensionais;

import java.util.Scanner;

/*
    EXERCÍCIO 68
Enunciado: Crie um programa que leia 8 números inteiros e exiba todos os valores pares
armazenados no array.

*/

public class ValoresParesEmUmArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[8];
        int[] pares;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número inteiro : " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

        }

        System.out.println("Números pares no array:");
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }

        scanner.close();
    }
}
