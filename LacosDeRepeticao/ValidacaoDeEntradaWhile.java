package LacosDeRepeticao;
import java.util.Scanner;


/*
    EXERCÍCIO 58
Enunciado: Crie um programa que leia um número inteiro entre 1 e 10. Caso o valor seja
inválido, continue pedindo a entrada até que um número válido seja fornecido.

*/

public class ValidacaoDeEntradaWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro entre 1 a 10: ");
        int numero = scanner.nextInt();

        while (numero < 1 || numero > 10) {
            
            System.out.println("-------------------");
            System.out.println("Número inválido. Tente novamente.");
            System.out.println("Digite um número inteiro entre 1 a 10: ");
            numero = scanner.nextInt();

        }
        
        System.out.println("Programa encerrado!");

        scanner.close();
    }
}
