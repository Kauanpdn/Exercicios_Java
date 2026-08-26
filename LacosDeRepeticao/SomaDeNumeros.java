package LacosDeRepeticao;

/*
    EXERCÍCIO 49
Enunciado: Escreva um programa que calcule a soma de todos os números de 1 a 100.

*/

public class SomaDeNumeros {
    public static void main(String[] args) {
        
        int soma = 0;

        for (int i = 1; i <= 100; i++){
            soma += i;
        }

        System.out.println(soma);
    }
}
