package ControleDeFluxo;
import java.util.Scanner;

/*
    EXERCÍCIO 39
Enunciado: Escreva um programa que leia as idades de duas pessoas e exiba quem é
mais velho. Caso as idades sejam iguais, exiba uma mensagem informando que as duas
pessoas têm a mesma idade.

*/

public class ComparacaoDeIdades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----- COMPARAÇÃO DE IDADE -----");
        
        System.out.println("Digite um valor inteiro: ");
        int idade1 = scanner.nextInt();

        System.out.println("Digite outro valor: ");
        int idade2 = scanner.nextInt();

        int maisVelho = Math.max(idade1, idade2);

        if (idade1 == idade2) {
            System.out.println("As duas pessoas tem a mesma idade");
        }else{
            System.out.println("O mais velho é " + maisVelho);
        }
        
        scanner.close();
    }
}