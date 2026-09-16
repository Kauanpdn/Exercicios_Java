package ArraysColecoes.ArraysUnidimensionais;

import java.util.Scanner;

/*
    EXERCÍCIO 74
Enunciado: Crie um programa que leia 10 números inteiros e exiba apenas os valores que
estão em posições ímpares no array.


*/

public class ElementosEmPosicoesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número inteiro " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int numero : numeros) {
            if (numero % 2 != 0) {
                System.out.println(numero);
            }
        }

        scanner.close();
    }
}
