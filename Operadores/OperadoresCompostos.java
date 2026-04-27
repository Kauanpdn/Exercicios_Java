package Operadores;

import java.util.Scanner;

/*
        Operadores Compostos 30

    Escreva um programa que leia dois números inteiros do usuário e aplique
    operadores compostos (e.g., +=, -=, *=, /=, %=) para modificar o valor da primeira variável
    em relação à segunda. Exiba o resultado após cada operação.
    Dica: Use o Scanner para receber os números.

*/
public class OperadoresCompostos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int primeiroValor = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int segundoValor = scanner.nextInt();

        int operacaoMaiorOuIgual = primeiroValor += segundoValor;
        int operacaoMenorOuIgual = primeiroValor -= segundoValor;
        int operacaoMultiplicadoOuIgual = primeiroValor *= segundoValor;
        int operacaoDivididoOuIgual = primeiroValor /= segundoValor;
        int operacaoRestoOuIgual = primeiroValor %= segundoValor;

        System.out.println("Operações e seus resultados!");
        
        System.out.println(" += " +  operacaoMaiorOuIgual);
        System.out.println(" -= " +  operacaoMenorOuIgual);
        System.out.println(" *= " +  operacaoMultiplicadoOuIgual);
        System.out.println(" /= " +  operacaoDivididoOuIgual);
        System.out.println(" %= " +  operacaoRestoOuIgual);

        scanner.close();
    }
}
