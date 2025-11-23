package Introducao_Java;

/*
Escreva um programa que converta um valor double em int e outro valor int em double.
Exiba os resultados das conversões e explique a diferença entre conversão explícita e
implícita.
Dica: procure por type casting em Java.
*/
public class ConversaoDeTipos {
    public static void main(String[] args) {
        
        // conversão inplpicita 
        int valorInteiro = 10;
        double conversaoDouble =  valorInteiro;
        System.out.println(conversaoDouble);

        // conversão explícita
        double valorDouble = 2.67;
        int conversaoInt = (int) valorDouble;
        System.out.println(conversaoInt);
    }
}
