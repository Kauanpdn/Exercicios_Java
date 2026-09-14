package ArraysColecoes.ArraysUnidimensionais;

import java.util.Scanner;

/*
    EXERCÍCIO 72
Enunciado: Desenvolva um programa que leia 10 números inteiros e armazene-os em um
array. O programa deve pedir ao usuário para inserir um número extra e contar quantas
vezes esse número aparece no array.
*/

public class ContagemDeOcorrenciasDeUmNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];
        int ocorrencias = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número inteiro: " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Digite um número para contar as ocorrências:");
        int numeroProcurado = scanner.nextInt();

        for (int numero : numeros) {
            if (numero == numeroProcurado) {
                ocorrencias++;
            }
        }

        System.out.println("O número " + numeroProcurado + " aparece " + ocorrencias + " vezes no array.");

        scanner.close();
    }
}
