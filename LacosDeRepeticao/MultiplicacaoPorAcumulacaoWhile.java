package LacosDeRepeticao;
import java.util.Scanner;
/*
    EXERCÍCIO 62
Enunciado: Desenvolva um programa que leia um número e multiplique esse número por 2
repetidamente até o valor exceder 1000.

*/


public class MultiplicacaoPorAcumulacaoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt(); 

        while (numero <= 1000) {
            numero *= 2;
            System.out.println(numero);
        }
        
        
        scanner.close();
    }
}
