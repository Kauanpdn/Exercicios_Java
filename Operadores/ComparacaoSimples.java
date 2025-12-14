package Operadores;
import java.util.Scanner;

/*
Crie um programa que leia dois números inteiros e exiba se o primeiro é maior, menor ou
igual ao segundo.
*/

public class ComparacaoSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " é maior que  " + num2 );
        }else if (num1 < num2) {
            System.out.println(num1 + " é menor que  " + num2 );
        }else{
            System.out.println(num1 + " e " + num2 + " são iguais");
        }
        
        scanner.close();
    }
}
