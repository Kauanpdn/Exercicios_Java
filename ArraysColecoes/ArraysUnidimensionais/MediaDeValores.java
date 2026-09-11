package ArraysColecoes.ArraysUnidimensionais;
import java.util.Scanner;


/*
    EXERCÍCIO 67
Enunciado: Escreva um programa que leia 10 números inteiros e calcule a média dos
valores inseridos, utilizando um array para armazenar os números.
*/

public class MediaDeValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[10];
        int soma = 0;
        int res = 0;
        
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Digite um número: " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            soma += numeros[i];

            res = soma / 10;
        }
        
        System.out.println("A média dos números é : " + res);

        scanner.close();
    }
}
