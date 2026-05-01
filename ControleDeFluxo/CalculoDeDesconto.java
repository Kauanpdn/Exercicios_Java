package ControleDeFluxo;
import java.util.Scanner;

/*
    EXERCÍCIO 33
    Desenvolva um programa que leia o valor de uma compra e aplique um
    desconto de 10% se o valor for superior a R$100,00. Exiba o valor final com ou sem  desconto

*/
public class CalculoDeDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um valor: ");
        double valorDigitadoPeloUsuario = scanner.nextDouble();

        if (valorDigitadoPeloUsuario > 100) {
            double valorComDesconto = valorDigitadoPeloUsuario - (valorDigitadoPeloUsuario * 0.10);
            System.out.println("O valor final com desconto fica: " + valorComDesconto);
        }else{
            System.out.println("O valor fica: " + valorDigitadoPeloUsuario);
        }


        scanner.close();
    }
}