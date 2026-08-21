package ControleDeFluxo;
import java.util.Scanner;


/*

        EXERCÍCIO 42
Enunciado: Crie um programa que leia uma nota de 0 a 10 e classifique a nota de acordo
com as seguintes categorias:
● 10: Excelente
● 8 e 9: Muito bom
● 6 e 7: Bom
● 5: Regular
● 0 a 4: Insuficiente

*/

public class ClassificacaoDeNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char continuar;

        do {

            System.out.println("Digite uma nota de (0 a 10) ");
            int nota = scanner.nextInt();

            switch (nota) {
                case 0: 
                case 1: 
                case 2: 
                case 3: 
                case 4: System.out.println("Insuficiente");
                    break;
                case 5: System.out.println("Regular"); 
                    break;
                case 6:
                case 7: System.out.println("Bom"); 
                    break;
                case 8:
                case 9: System.out.println("Muito bom"); 
                    break;
                case 10: System.out.println("Execelente"); break;       
                
                default:System.out.println("Valor inválido"); break;
            }

            System.out.println("Deseja verificar outra nota ? (S/N)");
            continuar = scanner.next().toUpperCase().charAt(0);

        } while (continuar == 'S');
        System.out.println("Programa encerrado");
        
        scanner.close();
    }    
}
