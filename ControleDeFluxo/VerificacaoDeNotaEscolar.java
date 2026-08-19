package ControleDeFluxo;

import java.util.Scanner;

/*
    EXERCÍCIO 38
Enunciado: Desenvolva um programa que leia uma nota escolar (de 0 a 10) e classifique-a
como "Insuficiente" (menor que 5), "Suficiente" (entre 5 e 7) ou "Bom" (maior que 7).

*/

public class VerificacaoDeNotaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----- NOTA ESCOLAR -----");
        
        System.out.println("Digite uma nota de 0 a 10 : ");
        double nota = scanner.nextDouble();

        if (nota < 5 && nota >=  0) {
            System.out.println("Insuficente");
        }else if(nota >= 5 && nota <=7){
            System.out.println("Suficiente");
        }else if(nota > 7 && nota <= 10){
            System.out.println("Bom");
        }else{
            System.out.println("Número inválido");
        }
        
        scanner.close();
    }
}
