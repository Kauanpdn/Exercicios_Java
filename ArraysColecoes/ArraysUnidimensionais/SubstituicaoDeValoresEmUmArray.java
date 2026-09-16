package ArraysColecoes.ArraysUnidimensionais;
import java.util.Arrays;
import java.util.Scanner;

/*
    EXERCÍCIO 75
Enunciado: Desenvolva um programa que crie um array de 10 números inteiros. O
programa deve pedir ao usuário que forneça dois números: um número para buscar no
array e outro para substituir o número encontrado. Se o número for encontrado, ele deve ser
substituído.
*/

public class SubstituicaoDeValoresEmUmArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = i;
        }

        System.out.println("Digite o núemro que queira buscar! ");
        int numeroDaBusca = scanner.nextInt();

        System.out.println("Digite um valor para substituir caso o número acima for encontrado: ");
        int numeroAtualizado = scanner.nextInt();


        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] == numeroDaBusca) {
                    numeros[i] = numeroAtualizado;
            }
        }

        System.out.println(Arrays.toString(numeros));

        scanner.close();

    }
}
