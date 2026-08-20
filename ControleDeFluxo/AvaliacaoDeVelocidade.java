package ControleDeFluxo;
import java.util.Scanner;

/*
    EXERCÍCIO 40
Enunciado: Crie um programa que leia a velocidade de um veículo e exiba uma mensagem
dizendo se o veículo está dentro do limite de velocidade (até 60 km/h), acima do limite
(entre 61 km/h e 80 km/h) ou muito acima do limite (acima de 80 km/h).

*/

public class AvaliacaoDeVelocidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char continuar;

        do {
            System.out.println("----- Velocidade de um veículo -----");
            
            System.out.println("Digite uma velocidade do veículo (em KM/h)");
            int velocidade  = scanner.nextInt();

            if (velocidade > 0 && velocidade <= 60) {
                    System.out.println("Dentro do limite :) ");
            }else if(velocidade > 60 && velocidade <= 80){
                System.out.println("Acima do limite !");
            }else if (velocidade > 80){
                System.out.println("Muito acima do limite :(");
            }else{
                System.out.println("Digite um valor válido");
            }

            System.out.println("\n deseja verificar outro veículo ? (S/N)");
            continuar = scanner.next().toUpperCase().charAt(0);
            System.out.println();

        } while (continuar == 'S');
        System.out.println("Programa encerrado");
        scanner.close();
    }
}
