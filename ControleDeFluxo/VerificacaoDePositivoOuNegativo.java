package ControleDeFluxo;
import java.util.Scanner;

/*
    EXERCÍCIO 31

    Escreva um programa que leia um número inteiro e verifique se ele é positivo,
    negativo ou zero. Exiba uma mensagem apropriada para cada caso.
*/


public class VerificacaoDePositivoOuNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro N: ");
        int valorDigitadoPeloUsuario = scanner.nextInt();

        if (valorDigitadoPeloUsuario > 0) {
            System.out.println("O número digitado pelo usuário " + valorDigitadoPeloUsuario + " é posotivo");
        }else if (valorDigitadoPeloUsuario < 0) {
            System.out.println("O número digitado pelo usuário " + valorDigitadoPeloUsuario + " é negativo");
        }else{
            System.out.println("O número digitado pelo usuário é igual a 0");
        }

        scanner.close();
    }
}
