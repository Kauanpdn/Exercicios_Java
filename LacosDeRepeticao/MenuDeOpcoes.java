package LacosDeRepeticao;

import java.util.Scanner;

/*
    EXERCÍCIO 64
Enunciado: Crie um programa que exiba um menu de opções e permita ao usuário
escolher uma ação (como somar dois números, subtrair, etc.). O menu deve continuar
sendo exibido até o usuário escolher a opção de sair.

*/

public class MenuDeOpcoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        int res;

        do {
            System.out.println("----- MENU DE OPÇÕES -----");
            System.out.println("--Calculadora--");

            System.out.println("Digite um número inteiro: ");
            int num1 = scanner.nextInt();

            System.out.println("Digite outro número inteiro: ");
            int num2 = scanner.nextInt();

            System.out.println("Escolha uma operação matemática: (+,-,*,/)");
            char operacao = scanner.next().toUpperCase().charAt(0);

            switch (operacao) {
                case '+':
                    res = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + res);
                    break;
                case '-':
                    res = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + res);
                    break;
                case '*':
                    res = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + res);
                    break;
                case '/':
                    if (num2 != 0) {
                        res = num1 / num2;
                        System.out.println(num1 + " / " + num2 + " = " + res);
                    } else {
                        System.out.println("Não é possível dividir por zero!");
                    }
                    break;
            }

            System.out.println("Deseja fazer outra operação ? (S/N)");
            opcao = scanner.next().toUpperCase().charAt(0);

        } while (opcao == 'S');
        System.out.println("Programa encerrado");

        scanner.close();
    }
}
