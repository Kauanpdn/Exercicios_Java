package LacosDeRepeticao;
import java.util.Scanner;

/*
    EXERCÍCIO 53
Enunciado: Crie um programa que leia 5 números inteiros do usuário e calcule a média
deles.


*/

public class MediaDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("----- Média de números -----");

        int soma = 0;

        for (int i = 1; i <= 5; i++){
            System.out.println("Digite um número inteiro: " + i + "º número: ");
            soma += scanner.nextInt();
        }

        int media = soma / 5;

        System.out.println();
        System.out.println();

        System.out.println(soma);
        System.out.println(media);
        
        scanner.close();
    }
}
