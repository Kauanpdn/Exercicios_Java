package ArraysColecoes.ArraysUnidimensionais;

import java.util.Scanner;

/*
    EXERCÍCIO 73
Enunciado: Escreva um programa que crie um array de 5 números inteiros e multiplique
todos os seus valores por 2, exibindo o novo array no console.

*/

public class DuplicacaoDeValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número inteiro " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        System.out.println("Valores duplicados:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] *= 2;
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}
