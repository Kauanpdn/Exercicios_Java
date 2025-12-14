package Operadores;
import java.util.Scanner;

/*Escreva um programa que leia dois números inteiros do usuário e exiba o resultado da
potenciação do primeiro número elevado ao segundo número (use o método Math.pow).
Dica: pow recebe dois argumentos, o primeiro a base e o segundo o expoente.*/

public class Potenciacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segunfo número: ");
        int num2 = scanner.nextInt();

        int potenciacao = Math.powExact(num1, num2);
        
        System.out.println(potenciacao);

        scanner.close();
    }
}
