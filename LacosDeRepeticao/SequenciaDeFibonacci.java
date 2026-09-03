package LacosDeRepeticao;

/*
    EXECÍCIO 55
Enunciado: Escreva um programa que exiba os primeiros 10 termos da sequência de
Fibonacci.

*/

public class SequenciaDeFibonacci {
    public static void main(String[] args) {
        
        int termo1 = 0;
        int termo2 = 1;
        
        for (int i = 3; i <= 10; i++){
            int proximoTermo = termo1 + termo2;
            System.out.println(proximoTermo + " ");
            termo1 = termo2;
            termo2 = proximoTermo;
        }
    }
}
