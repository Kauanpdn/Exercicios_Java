package LacosDeRepeticao;

/*
    EXERCÍCIO 56
Enunciado: Crie um programa que calcule o produto dos números inteiros de 1 a 10.

*/


public class ProdutoDeNumeros {
    public static void main(String[] args) {
        
        int fatorial = 10;
        long produto = 1;

        for(int i = 1; i <= fatorial; i++){
            produto *= i;  
        }

        System.out.println("O produto de 1 a 10 é : " + produto );
    }
}
