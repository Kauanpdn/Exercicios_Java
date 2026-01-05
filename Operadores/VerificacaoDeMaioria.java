package Operadores;

/*
    Exercício 23
Escreva um programa que leia a idade de três pessoas e verifique se pelo menos duas
delas são maiores de idade (18 anos ou mais).
*/

public class VerificacaoDeMaioria {
    public static void main(String[] args) {
        
        int idade1 = 19;
        int idade2 = 18;
        int idade3 = 17;

        int maiorIdade = 0;

        if (idade1 >= 18) maiorIdade++;
        if (idade2 >= 18) maiorIdade++;
        if (idade3 >= 18) maiorIdade++;

        if (maiorIdade >= 2) {
            System.out.println("Pelo menos duas pessoas são maiores de idade");
        }else{
            System.out.println("Menos de duas pessoas são maiores de idade");
        }

    }
}
