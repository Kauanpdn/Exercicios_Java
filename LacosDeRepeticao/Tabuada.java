package LacosDeRepeticao;
import java.util.Scanner;
/*
    EXERCÍCIO 50
Enunciado: Crie um programa que exiba a tabuada de um número fornecido pelo usuário,
de 1 a 10.

*/

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("----- TABUADA -----");

        System.out.println("Digite um número para vê a tabuada:");
        int numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++){
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        
        scanner.close();        
    }
}
