package Operadores;

/*
Escreva um programa que leia um número inteiro e verifique se ele está entre 10 e 20
(inclusive). Exiba uma mensagem informando se o número está dentro ou fora do intervalo.
*/

public class VerificacaoDeIntervalo {
    public static void main(String[] args) {
        int num = 13;
        
        if (num >= 10 && num <= 20) {
            System.out.println(num + " Está dentro do intervalo de 10 e 20");
        }else{
            System.out.println(num + " Não está dentro do intervalo de 10 e 20");
        }
    }
}
