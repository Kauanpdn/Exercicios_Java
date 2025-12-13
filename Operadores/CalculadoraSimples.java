package Operadores;
import java.util.Scanner;


/*
Crie um programa que leia dois números inteiros do usuário e exiba a soma, subtração,
multiplicação, divisão e o módulo desses números no console.
*/  

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um número inteiro: ");
        int a = scanner.nextInt();

        System.out.println("digite o segundo número: ");
        int b = scanner.nextInt();

        int soma = a + b;
        int sub = a - b;
        int mult = a * b;
        int divi = a / b;
        int mod = a % b;

        System.out.println(soma);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(divi);
        System.out.println(mod);

        scanner.close();
    }
}
