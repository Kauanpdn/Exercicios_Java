package Operadores;

/*
    EXERCÍCIO 27
Enunciado: Escreva um programa que declare uma variável inteira, aplique o operador de
incremento (++) e decremento (--), e exiba o valor da variável antes e depois de cada
operação.

*/

public class IncrementoDecremento {
    public static void main(String[] args) {
        int valor = 10;
        System.out.println("Valor original: " + valor);

        valor++;
        System.out.println("Valor com o incremento ++ " + valor);

        valor--;
        System.out.println("Valor com decremento -- " + valor);
    }
}
