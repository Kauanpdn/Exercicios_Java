package ArraysColecoes.ArraysUnidimensionais;

import java.util.Scanner;

/*
    EXERCÍCIO 71
Enunciado: Crie um programa que leia 6 números inteiros e armazene-os em um array.
Depois, exiba os valores do array na ordem inversa.
*/

public class InversaoDeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[6];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        System.out.println("Números em ordem inversa:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}
