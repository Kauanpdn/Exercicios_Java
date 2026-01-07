package Operadores;
import java.util.Scanner;

/*
    Exercício 25

Escreva um programa que leia três números inteiros e verifique se pelo menos dois deles
são positivos.
*/

public class VerificacaoDeNumerosPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("verifique se pelo menos dois deles são positivos!");

        System.out.println("Digite o primeiro número");
        int num1 = scanner.nextInt();
    
        System.out.println("Digite o segundo número");
        int num2 = scanner.nextInt();
    
        System.out.println("Digite o terceiro número");
        int num3 = scanner.nextInt();

        int vericador = 0;

        if (num1 > 0) {vericador++;}
        if (num2 > 0) {vericador++;}
        if (num3 > 0) {vericador++;}

        if (vericador >= 2) {
            System.out.println("Pelo menos dois deles são positivos");
        }else{
            System.out.println("Menos dois deles são positivos");
        }


        scanner.close();
    }
}
