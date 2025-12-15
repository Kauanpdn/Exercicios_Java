package Operadores;

/*
Desenvolva um programa que leia três números inteiros e exiba o maior deles.
*/

public class MaiorDeTresNumeros {
    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int maior = Math.max(num1, Math.max(num2, num3));

        System.out.println(maior);
    }
}
