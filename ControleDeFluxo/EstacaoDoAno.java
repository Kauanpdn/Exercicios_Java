package ControleDeFluxo;
import java.util.Scanner;

/*
    EXERCÍCIO 44
Enunciado: Escreva um programa que leia um número de 1 a 4 e exiba o nome da estação
do ano correspondente:

● 1: Verão
● 2: Outono
● 3: Inverno
● 4: Primavera

*/

public class EstacaoDoAno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        char opcao;
        
        do {
            System.out.println("---- ESTAÇÕES DO ANO ----");
            
            System.out.println("Escolha um número de 1 a 4: ");
            int num = scanner.nextInt();

            switch (num) {
                case 1: System.out.println("Verão");
                    
                    break;
                case 2: System.out.println("Outono");
                    
                    break;
                case 3: System.out.println("Inverno");
                    
                    break;
                case 4: System.out.println("Primavera");
                    
                    break;
            
                default:System.out.println("Opção inválida!");
                    break;

            }

            System.out.println("Deseja continuar ? (S/N)");
            opcao = scanner.next().toUpperCase().charAt(0);

        } while (opcao == 'S');
        System.out.println("Programa encerrado!");
        
        scanner.close();
    }
}
