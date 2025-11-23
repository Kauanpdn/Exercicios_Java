package Introducao_Java;

/*
Crie um programa que utilize a palavra-chave final para declarar uma constante que
representa a velocidade da luz no vácuo. Tente alterar o valor da constante e observe o
comportamento do compilador.

*/

public class Constantes {
    public static void main(String[] args) {
        final double VELOCIDADE_DA_LUZ = 299792458;

        System.out.println("A velocidade da luz: " + VELOCIDADE_DA_LUZ + " m/s ");

        // VELOCIDADE_DA_LUZ = 300000000; // Esta linha causará um erro de compilação
    }
}
