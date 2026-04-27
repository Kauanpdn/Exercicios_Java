package Operadores;

/*
                Exercício 29
    Enunciado: Crie um programa que demonstre a diferença entre o pré-incremento
    (++variavel) e o pós-incremento (variavel++). Utilize exemplos práticos e exiba os resultados
    no console.
*/

public class PreIncremento {
    public static void main(String[] args) {
        int valor = 5;
        int preIncremento = ++valor;

        System.out.println("O pré-incremento de: " + valor + " = " + preIncremento);

        System.out.println("O pós-incremento de: " + valor + " = " + preIncremento++);

        
    }
}
