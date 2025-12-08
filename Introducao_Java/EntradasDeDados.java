package Introducao_Java;

/*
Escreva um programa que leia um número inteiro e um número decimal do teclado e, em
seguida, exiba a soma desses números no console.
Dica: utilize o pacote/classe Scanner.

*/

import java.util.Scanner;


class EntradasDeDados {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numeroInteiro = scanner.nextInt();

        System.out.println("Digite um número dicimal: ");
        double numeroDecimal = scanner.nextDouble();


        double soma = numeroInteiro + numeroDecimal;

        System.out.println("A soma entre os números é: " + soma);

        scanner.close();
    }
}
