package ArraysColecoes.ArraysUnidimensionais;
import java.util.Scanner;


/*
    EXERCÍCIO 79
Enunciado: Escreva um programa que leia 8 números inteiros e verifique se os valores
estão em ordem crescente. Exiba uma mensagem indicando se os números estão ou não
em ordem.


*/

public class VerificacaoDeOrdemCrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[8];
        boolean emOrdem = true;

        for( int i = 0; i < numeros.length; i++){
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        for(int i = 0; i < numeros.length - 1; i++){
            if (numeros[i] > numeros[i + 1]) {
                emOrdem = false;
                break;
            }
        }

        if (emOrdem) {
            System.out.println("Os números estão em ordem crescente.");
        }else{
            System.out.println("Os números NÃO estão em ordem crescente.");
        }
        
        scanner.close();
    }
}


/*
Explicação: O programa verifica se os números lidos estão em ordem crescente,
comparando cada elemento com o próximo no array. Se algum número estiver fora de
ordem, ele exibe uma mensagem indicando isso.

*/
