package ControleDeFluxo;
import java.util.Scanner;


/*
    Exercício 35

Enunciado: Crie um programa que leia uma nota de 0 a 100 e exiba uma mensagem de
aprovação se a nota for maior ou igual a 60. Caso contrário, exiba uma mensagem de
reprovação.

*/

public class ClassificacaoDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------- Digite uma note de 0 a 100 -------- ");
        System.out.println("Qaul a sua nota ? ");
        
        int valorDigitado = scanner.nextInt();
        
        if (valorDigitado >= 60 && valorDigitado <=100) {
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
 
        scanner.close();
    }
    
}
