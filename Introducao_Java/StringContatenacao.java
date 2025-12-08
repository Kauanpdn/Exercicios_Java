package Introducao_Java;
import java.util.Scanner;

/*
Crie um programa que peça ao usuário para digitar seu nome e sobrenome. O programa
deve exibir uma mensagem de boas-vindas concatenando o nome e o sobrenome do
usuário.

*/

public class StringContatenacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("Olá " + nome + " " + sobrenome + " seja bem-vindo! ");
        
        scanner.close();
    }
}
