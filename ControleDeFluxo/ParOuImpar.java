package ControleDeFluxo;
import java.util.Scanner;

/*
    EXERCÍCIO 32
    Crie um programa que leia um número inteiro e exiba se o número é par ou ímpar

*/

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int valorDigitadoPeloUsuario = scanner.nextInt();

        if (valorDigitadoPeloUsuario % 2 == 0) {
            System.out.println("O número é par ");
        }else{
            System.out.println("O número é ímpar ");
        }

        scanner.close();
    }
}
