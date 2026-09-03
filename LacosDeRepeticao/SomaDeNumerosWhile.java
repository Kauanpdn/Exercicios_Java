package LacosDeRepeticao;
import java.util.Scanner;

/*

    EXECÍCIO 59

Enunciado: Desenvolva um programa que leia números inteiros do usuário e exiba a soma
acumulada. O programa deve terminar quando o usuário digitar o número zero.


*/

public class SomaDeNumerosWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();


        int soma = 0;

        while (numero != 0) {
            System.out.println("Digite um número inteiro: ");
            numero = scanner.nextInt();

            soma += numero;

            System.out.println("Número acumulado: " + soma);
        }

        System.err.println("Programa encerrado!");
        
        scanner.close();
    }
}
