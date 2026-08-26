package LacosDeRepeticao;
import java.util.Scanner;

/*
    EXERCÍCIO 51

Enunciado: Desenvolva um programa que calcule o fatorial de um número inteiro fornecido
pelo usuário.

*/

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("----- FATORIAL -----");
        
        System.out.println("Digite um número inteiro: ");
        int numero  = scanner.nextInt();
        
        int fatorial = 1;

        for (int i = 2; i <= numero; i++){
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        
        scanner.close();
    }
}
