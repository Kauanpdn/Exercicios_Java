package ArraysColecoes.ArraysUnidimensionais;

import java.util.Scanner;

/*
    EXERCÍCIO 69
Enunciado: Desenvolva um programa que leia 10 números inteiros e armazene-os em um
array. Encontre e exiba o menor e o maior valor presentes no array.
*/

public class MenorMaiorValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];
        int maior;
        int menor;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número inteiro " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        maior = menor = numeros[0];

        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
        
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);

        scanner.close();
    }
}
