package ArraysColecoes.ArraysUnidimensionais;

import java.util.Scanner;

/*
    EXERCÍCIO 76
Enunciado: Escreva um programa que leia 10 números inteiros e verifique se algum valor é
repetido no array. Se houver repetições, exiba uma mensagem informando.

*/

public class VerificacaoDeElementosRepetidos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];
        boolean repetido = false;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    repetido = true;
                    break;
                }
            }
        }

        if (repetido) {
            System.out.println("Há valores repetidos no array.");
        } else {
            System.out.println("Não há valores repetidos no array.");
        }

        scanner.close();
    }
}
