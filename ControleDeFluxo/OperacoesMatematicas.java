package ControleDeFluxo;
import java.util.Scanner;

/*
    EXERCÍCIO 43
Enunciado: Desenvolva um programa que leia dois números e um operador (+, -, *, /) e
realize a operação correspondente. Exiba o resultado no console.

*/

public class OperacoesMatematicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char continuar;

        do {

            System.out.println("----- OPERAÇÕES MATEMÁTICAS ----");
            
            System.out.println("Digite um número: ");
            Double num1 = scanner.nextDouble();

            System.out.println("Digite outro número: ");
            Double num2 = scanner.nextDouble();

            System.out.println("Escolha uma operação matemática (+, -, *, /)");
            char opercao = scanner.next().toUpperCase().charAt(0);

            Double res = 0.0;

            switch (opercao) {
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
                        }else{
                            System.out.println("Não é possível dividir por zero!");
                        }   
                    break;
            
                default: System.out.println("Operação inválida");
                    break;
            }

            System.out.println("Deseja fazer outra operação ? (S/N)");
            continuar = scanner.next().toUpperCase().charAt(0);

        } while (continuar == 'S');
        System.out.println("Programa encerrado");

        scanner.close();
    }
}
