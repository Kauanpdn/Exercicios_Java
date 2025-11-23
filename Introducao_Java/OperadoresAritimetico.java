package Introducao_Java;

/*Desenvolva um programa que declare duas variáveis int e realize as operações de soma,
subtração, multiplicação, divisão e módulo entre elas. Exiba os resultados de cada
operação.*/


public class OperadoresAritimetico {
    public static void main(String[] args) {
        int num1  = 10;
        int num2 = 2;

        int soma = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        int divi = num1 / num2;
        int modulo = num1 % num2;

        System.out.println("A soma fica:  " + soma );
        System.out.println("A subtração fica:  " + sub );
        System.out.println("A multiplicação fica: " + mult );
        System.out.println("A divisão fica:  " + divi );
        System.out.println("O módulo fica:  " + modulo );
        
    }
}
