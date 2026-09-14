package ArraysColecoes.ArraysUnidimensionais;
import java.util.Scanner;

/*
    EXERCÍCIO 70
Enunciado: Escreva um programa que leia 15 números inteiros e, em seguida, exiba
quantos desses números são positivos e quantos são negativos.

*/

public class ContagemDeValoresPositivosNegativos {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Positivo ou Negativo ?");
        System.out.println("----- Digite 15 números inteiros -----");
        
        int[] numeros = new int[15];
        int positivos = 0;
        int negativos = 0;
        


        for(int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int numero : numeros) {
            
            if (numero > 0) {
                positivos++;
            }

            if (numero < 0) {
                negativos++;
            }
        }

        System.out.println("O total de positivos são: " + positivos);
        System.out.println("O total de negativos são: " + negativos);

        scanner.close();

    }
}
