package ControleDeFluxo;

import java.util.Scanner;

/*

    EXERCÍCIO   36
Desenvolva um programa que leia três números inteiros e exiba o maior deles.
Caso dois ou mais números sejam iguais, exiba uma mensagem indicando que há números
iguais.

*/

public class ComparacaodeTresNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Obs: Todos os número tem que ser inteiros");

        System.out.println("Digite o primeiro número");
        int num1 = scanner.nextInt();

        System.out.println("Digite o Segundo número");
        int num2 = scanner.nextInt();

        System.out.println("Digite o Terceiro número");
        int num3 = scanner.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("Todos os números são iguais.");
        } else if (num1 >= num2 && num1 >= num3) {
            System.out.println("O maior número é: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("O maior número é: " + num3);
        }

        scanner.close();

    }
}
