package Operadores;

import java.util.Scanner;

/*
    Exercício 22

Crie um programa que leia três números inteiros e verifique se pelo menos um deles é
maior que 10 (usando o operador ||). Em seguida, verifique se todos são maiores que 10
(usando o operador &&).

*/

public class Operadoreslogicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Digite o terceiro número: ");
        int num3 = scanner.nextInt();




        if (num1 > 10 && num2 > 10 && num3 > 10) {
            System.out.println("Todos eles são maiores que 10!");
        }else if (num1 > 10 || num2 > 10 || num3 > 10) {
            System.out.println("Pelo menos um deles é maior que 10!");
        }else{
            System.out.println("Todos eles são menores que 10!");
        }
        
        scanner.close();
    }
}
