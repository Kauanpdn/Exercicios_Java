package Operadores;

/*
Crie um programa que leia a idade de uma pessoa e verifique se ela é elegível para votar
(idade igual ou superior a 18 anos).
*/

public class ElegibilidadeDeVotacao {
    public static void main(String[] args) {
        
        int idade = 17;

        if (idade >= 18) {
            System.out.println("Está elegível para a votar");
        }else{
            System.out.println("Você não está elegível para votar");
        }
    }
}
