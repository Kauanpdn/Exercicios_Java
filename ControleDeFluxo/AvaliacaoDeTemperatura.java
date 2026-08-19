package ControleDeFluxo;
import java.util.Scanner;
/*

    EXERCÍCIO 37

Escreva um programa que leia a temperatura atual em graus Celsius e exiba
uma mensagem dizendo se o clima está "Frio" (abaixo de 15oC), "Agradável" (entre 15oC e
30oC) ou "Quente" (acima de 30oC).

*/

public class AvaliacaoDeTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("TEMPERATURA ATUAL");
        System.out.println("Digite um valor de temperatura em graus celsius: ");
        int temperatura = scanner.nextInt();

        if(temperatura >= 15 && temperatura <= 30){
            System.out.println("O clima está agradável");
        }else if(temperatura < 15){
            System.out.println("O clima está frio");
        }else{
            System.out.println("O clima está quente");
        }


        scanner.close();
    }
}
