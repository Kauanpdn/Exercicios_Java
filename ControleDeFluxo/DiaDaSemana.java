package ControleDeFluxo;
import java.util.Scanner;

/*
    EXERCÍCIO 41
Enunciado: Escreva um programa que leia um número inteiro de 1 a 7 e exiba o nome do
dia da semana correspondente (1 para domingo, 2 para segunda-feira, etc.).

*/

public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dia;

        do {
            System.out.println("Digite o número do dia da semana (1 a 7) ou 0 para encerrar");
            dia = scanner.nextInt();

            switch (dia) {
                case 1: System.out.println("Domingo"); break;
                case 2: System.out.println("Segunda-feira"); break;
                case 3: System.out.println("Terça-feira"); break;
                case 4: System.out.println("Quarta-feira"); break;
                case 5: System.out.println("Quinta-feira"); break;
                case 6: System.out.println("Sexta-feira"); break;
                case 7: System.out.println("Sábado"); break;
                case 0: System.out.println("Programa encerrado"); break;
                default: System.out.println("Valor inválido"); break;
            }

        } while (dia != 0);
        
        
        scanner.close();
    }
}
