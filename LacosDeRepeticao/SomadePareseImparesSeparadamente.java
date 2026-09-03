package LacosDeRepeticao;


/*
    EXERCÍCIO 57
Enunciado: Escreva um programa que some todos os números pares de 1 a 100 e,
separadamente, todos os números ímpares de 1 a 100.

*/

public class SomadePareseImparesSeparadamente {
    public static void main(String[] args) {
        
        int somaPares = 0;
        int somaImpares = 0;
        
        for (int i = 1; i <= 100; i++){

            if(i % 2 == 0){
                somaPares += i;
            }else{
                somaImpares += i;
            }
        }

        System.out.println(somaPares);
        System.out.println(somaImpares);
    }
}
