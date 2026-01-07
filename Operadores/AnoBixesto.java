package Operadores;
import java.util.Scanner;

/*
    Exercício 2
Crie um programa que leia um ano e verifique se ele é bissexto. Um ano é bissexto se for
divisível por 4, mas não por 100, exceto se for divisível por 400.
*/

public class AnoBixesto {
    public static void main(String[] args) {
        Scanner scanner  =  new Scanner(System.in);
        
        System.out.println("Digite um ano: ");
        int ano = scanner.nextInt();

        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.println("Esse ano é bissexsto");
        }else{
            System.out.println("O ano não é bissexto");
        }

        scanner.close();
    }
    
}
