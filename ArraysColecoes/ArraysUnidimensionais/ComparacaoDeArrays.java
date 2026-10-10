package ArraysColecoes.ArraysUnidimensionais;

import java.util.Scanner;

/*
    EXERCÍCIO 78
Enunciado: Desenvolva um programa que crie dois arrays de 5 números inteiros. O
programa deve comparar os dois arrays e exibir quais posições possuem valores iguais.

*/

public class ComparacaoDeArrays {
    public static void main(String[] args) {

        Scanner scanner = new  Scanner(System.in);

        int[] array1 = new int[5];
        int[] array2 = new int[5];

        System.out.println("Preencha o primeiro array:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        System.out.println("Preencha o segundo array:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        System.out.println("Comparação de valores nas mesmas posições:");
        for (int i = 0; i < array1.length; i++) {
                if (array1[i] == array2[i]) {
                        System.out.println("Posição " + i + ": " + array1[i] + " = " + array2[i]);
                }
        }    
        
        scanner.close();
    }
}
