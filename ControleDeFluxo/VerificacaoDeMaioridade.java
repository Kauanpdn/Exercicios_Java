package ControleDeFluxo;
import java.util.Scanner;

/*
    EXERCÍCIO 34
    Escreva um programa que leia a idade de uma pessoa e exiba uma mensagem
    informando se ela é menor de idade (menor que 18 anos), maior de idade (18 anos ou mais)
    ou idosa (60 anos ou mais).
*/

public class VerificacaoDeMaioridade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma idade: ");
        int idadeDigitadaPeloUsuario = scanner.nextInt();

        if (idadeDigitadaPeloUsuario >= 18 &&  idadeDigitadaPeloUsuario < 60) {
            System.out.println("Essa pessoa é maior de idade!");
        }else if(idadeDigitadaPeloUsuario < 18){
            System.out.println("Essa pessoa é menor de idade!");
        }else{
            System.out.println("Essa pessoa é idosa");
        }

        scanner.close();
    }
}
