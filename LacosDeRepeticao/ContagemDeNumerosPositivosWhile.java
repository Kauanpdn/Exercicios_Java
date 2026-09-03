package LacosDeRepeticao;
import java.util.Scanner;
/*
    EXERCÍCIO 60
Enunciado: Escreva um programa que leia números inteiros e exiba quantos desses
números são positivos. O programa deve parar quando o usuário digitar um número
negativo.

*/

public class ContagemDeNumerosPositivosWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro: ");
        int valorDigitado = scanner.nextInt();
        
        int contador = 0;

        while (valorDigitado >= 1) {
            System.out.println("Digite um número inteiro: ");
            valorDigitado = scanner.nextInt();

            contador += 1;

            System.out.println("");
            System.out.println("Total de números inteiros são : " + contador);
        }

        System.out.println("Programa encerrado");
        
        scanner.close();
    }
}
