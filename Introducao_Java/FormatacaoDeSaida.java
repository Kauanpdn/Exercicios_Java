package Introducao_Java;

/*
Desenvolva um programa que exiba o valor de uma variável double com duas casas
decimais. Utilize formatação para garantir que o valor seja exibido corretamente.
Código de solução:
*/

public class FormatacaoDeSaida {
    public static void main(String[] args) {
        double valorDouble = 14.7325;

        String valorFormatado = String.format("%.2f", valorDouble);

        System.out.println(valorFormatado);
    }
}
