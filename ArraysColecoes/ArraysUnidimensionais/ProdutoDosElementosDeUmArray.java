package ArraysColecoes.ArraysUnidimensionais;
import java.util.Scanner;

/*
    EXERCÍCIO 77
Enunciado: Crie um programa que leia 6 números inteiros e calcule o produto de todos os
valores do array.

*/

public class ProdutoDosElementosDeUmArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new  int[6];
        int produto = 1;
        
        for(int i = 0; i < numeros.length; i++){
                System.out.println("Digite um número: " + (i + 1) + ": ");
                numeros[i] = scanner.nextInt();

                produto *= numeros[i];
        }

        System.out.println("A média dos números é : " + produto);
        
        
        scanner.close();        
    }
}


/*
Explicação: O programa lê 6 números inteiros e calcula o produto (multiplicação) de todos
os valores armazenados no array.

*/