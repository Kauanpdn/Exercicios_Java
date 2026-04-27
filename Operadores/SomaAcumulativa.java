package Operadores;
import java.util.Scanner;

/*
    EXERCÍCIO 28
Enunciado: Desenvolva um programa que leia cinco números inteiros do usuário, um por
vez, e acumule a soma deles usando o operador de atribuição +=. Exiba o total acumulado
ao final.
Dica: Utilize o Scanner para pedir os dados, e você pode utilizar um loop for para repetir a
solicitação de dados cinco vezes.
*/

public class SomaAcumulativa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int somaAcumulada = 0;

        for(int i = 1; i <= 5; i++){
            System.out.println("Digite o " + i + " número inteiro: ");
            int valorDigitado = scanner.nextInt();
            somaAcumulada += valorDigitado;
        }

        System.out.println("Soma acumulada: " + somaAcumulada);
        
        
        scanner.close();
    }    
}
