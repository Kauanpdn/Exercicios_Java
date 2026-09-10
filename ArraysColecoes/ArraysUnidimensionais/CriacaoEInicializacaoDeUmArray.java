package ArraysColecoes.ArraysUnidimensionais;

/*
    Exercício 65
Enunciado: Crie um programa que declare um array de 5 números inteiros. Atribua valores
a esse array e, em seguida, exiba os valores no console.

*/

public class CriacaoEInicializacaoDeUmArray {
    public static void main(String[] args) {
        
        int[] array = {1,2,3,4,5};
        System.out.println(java.util.Arrays.toString(array));

        for(int i = 0; i < array.length; i++){
            System.out.println("Elemento: " + i + " : " + array[i]);
        }
    }
}
