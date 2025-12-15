package Operadores;

import java.util.Scanner;;

/*
Escreva um programa que leia um número inteiro e exiba se ele é par ou ímpar.
Dica: Você pode utilizar a divisão de resto, com o operador %.
*/

public class VerificacapDePariedade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " é par");
        } else {
            System.out.println(numero + " é ímpar");
        }

        scanner.close();
    }
}
