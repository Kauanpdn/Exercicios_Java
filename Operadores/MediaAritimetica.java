package Operadores;
import java.util.Scanner;;

/*
Escreva um programa que leia três números inteiros do usuário e calcule a média aritmética
deles. Exiba o resultado no console.
Dica: Sempre que os exercícios pedirem para ‘ler’ algo, você deve utilizar a classe Scanner.
*/

public class MediaAritimetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        int nota1 = scanner.nextInt();

        System.out.println("Digite a segunda nota: ");
        int nota2 = scanner.nextInt();

        System.out.println("Digite a terceira nota: ");
        int nota3 = scanner.nextInt();

        int MediaAritimetica = (nota1 + nota2 + nota3) / 3;

        System.out.println("Sua média final é: " + MediaAritimetica);
        scanner.close();
    }
}
