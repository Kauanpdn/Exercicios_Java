package LacosDeRepeticao;

/*
    EXERCÍCIO 54
Desenvolva um programa que conte quantos números entre 1 e 100 são
múltiplos de 3.


*/


public class ContagemDeMultiplosDe3 {
    public static void main(String[] args) {

        int soma = 0;
        
        for (int i = 1; i <= 100; i++  ){

            if(i % 2 !=0 ){
                System.out.println(i + " é múltiplo de 3");

            soma ++;

            }
        }
        System.out.println(soma + " são os números múltiplos de 3 entre 1 a 100");
    }
}
