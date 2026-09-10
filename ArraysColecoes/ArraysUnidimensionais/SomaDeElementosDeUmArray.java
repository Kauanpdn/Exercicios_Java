package ArraysColecoes.ArraysUnidimensionais;
import java.util.Scanner;

/*
    EXERCÍCIO 66
Enunciado: Desenvolva um programa que leia 5 números inteiros do usuário, armazene-os
em um array e calcule a soma de todos os elementos.

*/

public class SomaDeElementosDeUmArray {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        
        int[] numeros = new int[5];
        int soma = 0;

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite um número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }
        
        System.out.println("A soma dos elementos do array é: " + soma);
        
        
        scanner.close();
    }
}
